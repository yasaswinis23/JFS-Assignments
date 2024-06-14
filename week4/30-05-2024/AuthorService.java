import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AuthorService {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    @Autowired
    public AuthorService(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Transactional
    public Author createAuthorWithBooks(String authorName, List<String> bookTitles) {
        Author author = new Author(authorName);
        for (String title : bookTitles) {
            Book book = new Book(title);
            author.addBook(book);
        }
        return authorRepository.save(author);
    }

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public Author getAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    @Transactional
    public Author addBookToAuthor(Long authorId, String bookTitle) {
        Author author = authorRepository.findById(authorId).orElse(null);
        if (author != null) {
            Book book = new Book(bookTitle);
            author.addBook(book);
            return authorRepository.save(author);
        }
        return null;
    }

    @Transactional
    public void removeBookFromAuthor(Long authorId, Long bookId) {
        Author author = authorRepository.findById(authorId).orElse(null);
        if (author != null) {
            Book book = bookRepository.findById(bookId).orElse(null);
            if (book != null) {
                author.removeBook(book);
                bookRepository.delete(book);
            }
        }
    }

    public void deleteAuthor(Long authorId) {
        authorRepository.deleteById(authorId);
    }
}

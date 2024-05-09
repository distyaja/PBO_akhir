import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Student> students;

    public Library() {
        books = new ArrayList<>();
        students = new ArrayList<>();
    }

    public void borrowBook(Book book, Student student) {
        if (student.canBorrow() && book.getStock() > 0) {
            book.setStock(book.getStock() - 1);
            student.setBorrowStatus(false);
        }
    }

    public void returnBook(Book book, Student student) {
        if (!student.canBorrow()) {
            book.setStock(book.getStock() + 1);
            student.setBorrowStatus(true);
        }
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Student> getStudents() {
        return students;
    }
}
import enums.Gender;
import enums.Genre;
import enums.Language;
import model.Book;
import model.User;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book>bookList = new ArrayList<>(Arrays.asList(
                new Book(345L,"Syngan Kylych", Genre.HISTORICAL, new  BigDecimal(6734L),"Tologon Kasymbekov",
                        Language.KYRGYZ, LocalDate.of(2008,3,3)),
                new Book(345L,"Syngan Kylych", Genre.HISTORICAL, new  BigDecimal(6734L),"Tologon Kasymbekov",
                        Language.KYRGYZ, LocalDate.of(2008,3,3)),

        new Book(345L,"Syngan Kylych", Genre.HISTORICAL, new  BigDecimal(6734L),"Tologon Kasymbekov",
                Language.KYRGYZ, LocalDate.of(2008,3,3)),
         new Book(345L,"Syngan Kylych", Genre.HISTORICAL, new  BigDecimal(6734L),"Tologon Kasymbekov",
                Language.KYRGYZ, LocalDate.of(2008,3,3)),
        new Book(345L,"Syngan Kylych", Genre.HISTORICAL, new  BigDecimal(6734L),"Tologon Kasymbekov",
                Language.KYRGYZ, LocalDate.of(2008,3,3))));


        List<User> userList = new ArrayList<>(Arrays.asList(
                new User(6367L,"Syimyk","Zhumabekov","@gmail.com","+996778367752", Gender.MALE,new BigDecimal(35434),bookList),
                new User(6367L,"Raxim","Bazarbaev","@gmail.com","+996778367754", Gender.MALE,new BigDecimal(355364),bookList),
                new User(6367L,"Muxamed","Toichubai uulu","@gmail.com","+996778367753", Gender.MALE,new BigDecimal(65734),bookList),
                new User(6367L,"Saltanat","Nematilla kyzy","@gmail.com","+996778367755", Gender.FEMALE,new BigDecimal(353764),bookList),
                new User(6367L,"Samira","Aytieva","@gmail.com","+996778367756", Gender.FEMALE,new BigDecimal(3534),bookList)));



















































        // Бардык Id лер уникальный болуш керек. Эгер уникальный болбосо озубуз тузгон UniqueConstraintException класс ыргытсын.
        // User дин email адресси уникальный болуш керек жана @ болуусу керек. Эгер уникальный болбосо UniqueConstraintException класс,
        // @ болбосо озубуз тузгон BadRequestException класс ыргытсын.
        // User дин телефон номери +996 дан башталып 13 символдон турсун. Болбосо BadRequestException класс ыргытсын.
        // Китептин баасы терс сан болбошу керек. Болбосо NegativeNumberException ыргытсын.
        // Китептин чыккан жылы келечек убакыт болбошу керек.Болбосо DateTimeException ыргытсын.
        // Китептин автору бош болбошу керек. Болбосо EmptyStackException ыргытсын.


        

    }
}
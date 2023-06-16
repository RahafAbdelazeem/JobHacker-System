package java8;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Product> categorysproducts = new Product().addDummyData();
        List<Product> bookscategoryproduct = categorysproducts.stream()
                .filter(product -> product.getCategory().equals("Books"))
                .collect(Collectors.toList());
// Print the list of books
        for (Product books : bookscategoryproduct) {
            System.out.println(books);
        }
        List<Product> expensivebookscategoryproduct = new ArrayList<>();
        System.out.println("expensive");
        for (Product expensivebooks : bookscategoryproduct) {
            if (expensivebooks.getPrice() > 100.00) {
                expensivebookscategoryproduct.add(expensivebooks);
            }

            for (Product expensivebook : expensivebookscategoryproduct) {
                System.out.println(expensivebook);
            }

        }
        List<Product> Toyscategory = new ArrayList<>();
        for (Product toy : categorysproducts) {
            if (toy.getCategory().equals("Toys")) {
                toy.setPrice(toy.getPrice() * 0.9); // Apply 10% discount
                Toyscategory.add(toy);
            }
        }
        System.out.println("discounttoycategory");
         for(Product discounttoy:Toyscategory) {
             System.out.println(discounttoy);
         }
          Product thecheapest=null;
         for(Product cheapbook: bookscategoryproduct){
         if(thecheapest==null|| cheapbook.getPrice()<thecheapest.getPrice()){
              thecheapest=cheapbook;
         }
         }
          System.out.println("the cheapest");
        System.out.println(thecheapest);


    }
}








package Java_basics.codes.DSA.Arrays;

import java.util.Arrays;

public class Array_objects {
    public static void main(String[] args) {
//        defining the size of array
        book[] books = new book[4];
//        now the object b has been created in the heap memory not in the array
        book b = new book("java",200,1);
//        now we put the object b in the array,
        books[0] = b;
        System.out.println(books); // this will provide us with location of the object inside the memory
//        simply creating an object does not put it inside the array , arrays always store the reference address of
//        the objects , same case in however we assign the values to the arrays ,unlike in case of arr[0] = "swayam"
//        which directly puts the value "swayam" inside array at zeroth position
//        another way to fill the books array
        books[1] = new book("Python",300,2);
        books[2] = new book("C++",100,3);
        books[3] = new book("Rust",400,4);
//      w/o the toString override it would have given the address
        System.out.println(Arrays.toString(books));
//     lambda function basically comparing on basis of price and sorting it w/o this comparator we couldn't have sorted
        Arrays.sort(books,(b1,b2)->(b1.price-b2.price));
        System.out.println(Arrays.toString(books));
    }
}
class book {
    int isbn;
    int price;
    String name;

    book(String name,int price, int isbn){
        this.name = name;
        this.price = price;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return  "name='" + name + " ,isbn=" + isbn + ", price=" + price +' ';
    }
}
public class MainClas {
    public static void main(String[] args){
        //instance(new) of the TextBox Class in other file
        var textBox1= new TextBox();
    // Note here you can not assign any variable to the word textBox1
    textBox1.setText("This is Box-1");
        var textBox2= textBox1;
        textBox2.setText("Hello! World");
        System.out.println(textBox2.text);
        System.out.println(textBox1.text.toUpperCase());

//       var textBox2= new TextBox();
//        textBox2.setText("This is Box-2");
//        System.out.println(textBox2.text);
    }
}

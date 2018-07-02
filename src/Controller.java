import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    public Controller(View view, Model model){
        this.model = model;
        this.view = view;
    }

    public void process() {
        Scanner sc = new Scanner(System.in);

        model.setWord(inputValueWithScanner(sc, View.WORD_FIRST_PART));
        model.addStringToWord(inputValueWithScanner(sc, View.WORD_SECOND_PART));
        view.printMessage(model.getWord());
        view.printMessage(View.CONGRATULATION);

    }

    public String inputValueWithScanner(Scanner sc, String searchWord){
        view.printMessage(View.INPUT_STRING_INFO);
        while (!sc.next().equals(searchWord)) {
            view.printMessage(View.INPUT_STRING_IS_WRONG);
            view.printMessage(View.INPUT_STRING_INFO);
        }
        return searchWord;
    }

}

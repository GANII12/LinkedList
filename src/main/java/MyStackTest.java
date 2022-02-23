import org.testng.Assert;
import org.testng.annotations.Test;

public class MyStackTest {
    @Test
    public void given3NumbersWhenAddedToStackShouldHaveLastAddedNode(){
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.printMyStack();
        INode peak = myStack.peak();
        Assert.assertEquals(myThirdNode,peak);
    }

    @Test
    public void given3NumbersInStackWhenPoppedShouldMatchWithLastAddedNode(){
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        INode pop = myStack.pop();
        myStack.printMyStack();
        Assert.assertEquals(myThirdNode,pop);
    }
}

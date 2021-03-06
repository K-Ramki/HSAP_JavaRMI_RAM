import java.rmi.RemoteException;

public class Impl_RI implements RI {

    @Override
    public void DoubleAdding(String[] userArray) throws RemoteException {
        double sum = 0;

        for (int i = 0; i < userArray.length; i++) {
            String num = userArray[i];
            double realNum = Double.parseDouble(num);
            sum += realNum;
        }

        String realSum = Double.toString(sum);
        System.out.println("Your sum is: " + realSum);

    }

    @Override
    public String printSum(String[] userArray) throws RemoteException {
        double sum = 0;

        for (int i = 0; i < userArray.length; i++) {
            String num = userArray[i];
            double realNum = Double.parseDouble(num);
            sum += realNum;
        }

        String realSum = Double.toString(sum);
        return "Your sum is: " + realSum;
    }
    
}
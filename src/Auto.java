public class Auto {

    public void gas() {

        System.out.println("�������");

       /*������ ���������� ���������� �����-�� ������� ����
       � ���������� ������� �� ���� ������*/
    }

    public void brake() {

        System.out.println("��������");

       /*������ ���������� ���������� �����-�� ������� ����
       � ���������� ������� �� ��������*/
    }

    public static void main(String[] args) {

        Auto auto = new Auto();

        //��� ��� �������� ��� ������������

        //����� ���� ������ - ������
        auto.gas();

        //����� ������ ������ - ����������
        auto.brake();
    }
}

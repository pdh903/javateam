import javax.swing.JOptionPane;

public class CheckDate {
	public static String Date;
	public CheckDate() {
		
	}

	public void setDate(int month, int date) {
		 //��¥ �ޱ�
		String error = "";
        boolean check = false;  //��¥ ���� �ߴ���
       
        //���� ��¥ - 2�� ����
        if(month == 2  && date > 28) {
        	error += "��¥�� �ٽ� �����ϼ��� (2���� 28�ϱ���)" + "\n";
        }
        //���� ��¥ - 1������ 7��
        else if(month < 8) {
        	if(month % 2 == 0 && date == 31) 
        		error += "��¥�� �ٽ� �����ϼ��� (" + month + "���� 30�ϱ���)" + "\n"; 
        	else check = true;
        }
        //���� ��¥ - 8������ 12��
        else {
        	if(month % 2 == 1 && date == 31) 
        		error += "��¥�� �ٽ� �����ϼ��� (" + month + "���� 30�ϱ���)" + "\n"; 
        	else check = true;
        }
        
        //  ���� �޽��� â ����
        if(check == false) {
        	JOptionPane.showMessageDialog(null, error,"��¥ ���� ����", JOptionPane.ERROR_MESSAGE);
        }
        else {
        	Date = "2018";
        	
        	//  ���õ� ���� ���� ���ڿ��� �ֱ�
        	if(month < 10) 
        		Date += "0" + month;
        	else
        		
        		Date += month;
        	//  ���õ� ���� ���� ���ڿ��� �ֱ�
        	if(date < 10)
        		Date += "0" + date;
        	else
        		Date += date;
        }
	}
	public String getDate() { 
		return Date; }
}

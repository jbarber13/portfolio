import java.util.ArrayList;

public class AddressList
{
	/*
	 *	NESTED CLASS
	 */
	private class ListNode
	{
		private ListNode next;
		private String name, telephoneNum, email, address, dob;
		
		private ListNode(String name, String telephone, String email, String address, String dob)
		{
			this.name = name;
			this.telephoneNum = telephone;
			this.email = email;
			this.address = address;
			this.dob = dob;
		}
		
		public String getName()
		{
			return name;
		}
		
		public String getPhone()
		{
			return telephoneNum;
		}
		
		public String getEmail()
		{
			return email;
		}
		
		public String getAddress()
		{
			return address;
		}
		
		public String getDOB()
		{
			return dob;
		}
		
		public void setName(String name)
		{
			this.name = name;
		}
		
		public void setPhone(String phone)
		{
			this.telephoneNum = phone;
		}
		
		public void setEmail(String email)
		{
			this.email = email;
		}
		
		public void setAddress(String address)
		{
			this.address = address;
		}
		
		public void setDOB(String dob)
		{
			this.dob = dob;
		}
	}
	
	/*
	 * BEGINNING OF ADDRESSLIST
	 */
	
	private static ArrayList<ListNode> addressList = new ArrayList<ListNode>();
	private ArrayList<ListNode> revList, tempList;
	private ListNode listNode, temp;
	private static ListNode head, currentNode;

	private int count = 0;
	private int index = -1;
	private String retToString;
	private String name, telephoneNum, email, address, dob, retString;
	
	public boolean isEmpty()
	{
		if (addressList.size() > 0)
		{
			return false;
		}
		return true;
	}
	
	public void addToFront(String name, String telephoneNum, String email, String address, String dob)
	{
		this.name = name;
		this.telephoneNum = telephoneNum;
		this.email = email;
		this.address = address;
		this.dob = dob;
		if (name.length() <= 0)
		{
			name = "N/A";
		}
		if (telephoneNum.length() <= 0)
		{
			telephoneNum = "N/A";
		}
		if (email.length() <= 0)
		{
			email = "N/A";
		}
		if (address.length() <= 0)
		{
			address = "N/A";
		}
		if (dob.length() <= 0)
		{
			dob = "N/A";
		}

		listNode = new ListNode(name, telephoneNum, email, address, dob);
		if (addressList.size() == 0)
		{
			addAddress(listNode);
		}
		else
		{
			makeNewArray(listNode);
		}
	}
	
	public void addToBack(String name, String telephoneNum, String email, String address, String dob)
	{
		this.name = name;
		this.telephoneNum = telephoneNum;
		this.email = email;
		this.address = address;
		this.dob = dob;
		if (name.length() <= 0)
		{
			name = "N/A";
		}
		if (telephoneNum.length() <= 0)
		{
			telephoneNum = "N/A";
		}
		if (email.length() <= 0)
		{
			email = "N/A";
		}
		if (address.length() <= 0)
		{
			address = "N/A";
		}
		if (dob.length() <= 0)
		{
			dob = "N/A";
		}
		listNode = new ListNode(name, telephoneNum, email, address, dob);
		addAddress(listNode);
	}
	
	public String toString()
	{
		retToString = "";
		for (int i = 0; i < addressList.size(); i++)
		{
			temp = addressList.get(i);
			retToString += temp.getName() + "\n" + temp.getPhone() + "\n" + temp.getEmail() + "\n" + temp.getAddress() + "\n" + temp.getDOB() + "\n\n";
			count++;
		}
		return retToString;
	}
	
	public String reverseToString()
	{
		retToString = "";
		for (int i = addressList.size()-1; i >= 0; i--)
		{
			temp = addressList.get(i);
			retToString += temp.getName() + "\n" + temp.getPhone() + "\n" + temp.getEmail() + "\n" + temp.getAddress() + "\n" + temp.getDOB() + "\n\n";
		}
		return retToString;
	}
	
	public ArrayList<ListNode> reverse()
	{
		revList = new ArrayList<ListNode>();
		for (int i = addressList.size()-1; i >= 0; i--)
		{
			revList.add(addressList.get(i));
		}
		for (int i = 0; i < revList.size(); i++)
		{
			addressList.set(i, revList.get(i));
		}
		return revList;
	}
	
	public int sizeOf()
	{
		count = 0;
		for (int i = 0; i < addressList.size(); i++)
		{
			count++;
		}
		return count;
	}
	
	public String phoneNumberByName(String name)
	{
		for (int i = 0; i < addressList.size(); i++)
		{
			temp = addressList.get(i);
			if (temp.getName().equalsIgnoreCase(name))
			{
				index = i;
				i = addressList.size()-1;
			}
		}
		if (index != -1)
		{
			temp = addressList.get(index);
			retString = temp.getPhone();
		}
		else
			retString = "No matching data";
		return retString;
	}
	
	public String emailByName(String name)
	{
		for (int i = 0; i < addressList.size(); i++)
		{
			temp = addressList.get(i);
			if (temp.getName().equalsIgnoreCase(name))
			{
				index = i;
				i = addressList.size()-1;
			}
		}
		if (index != -1)
		{
			temp = addressList.get(index);
			retString = temp.getEmail();
		}
		else
			retString = "No matching data";
		return retString;
	}
	
	public String nameByPhoneNumber(String telephoneNum)
	{
		for (int i = 0; i < addressList.size(); i++)
		{
			temp = addressList.get(i);
			if (temp.getPhone().equalsIgnoreCase(telephoneNum))
			{
				index = i;
				i = addressList.size()-1;
			}
		}
		if (index != -1)
		{
			temp = addressList.get(index);
			retString = temp.getName();
		}
		else
			retString = "No matching data";
		return retString;
	}
	
	public String dobByName(String name)
	{
		for (int i = 0; i < addressList.size(); i++)
		{
			temp = addressList.get(i);
			if (temp.getName().equalsIgnoreCase(name))
			{
				index = i;
				i = addressList.size()-1;
			}
		}
		if (index != -1)
		{
			temp = addressList.get(index);
			retString = temp.getDOB();
		}
		else
			retString = "No matching data";
		return retString;
	}
	
	private void addAddress(ListNode node)
	{
		addressList.add(node);
	}
	
	private void makeNewArray(ListNode newNode)
	{
		tempList = new ArrayList<ListNode>();
		
		for (int i = 1; i < addressList.size()+1; i++)
		{
			temp = addressList.get(i-1);
			tempList.add(temp);
		}
		
		removeAll();

		addressList.add(newNode);
		for (int i = 1; i < tempList.size()+1; i++)
		{
			temp = tempList.get(i-1);
			addressList.add(temp);
		}
	}
	
	private void removeAll()
	{
		addressList.removeAll(addressList);
	}
}

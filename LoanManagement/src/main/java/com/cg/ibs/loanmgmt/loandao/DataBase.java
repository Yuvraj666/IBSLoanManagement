package com.cg.ibs.loanmgmt.loandao;

public class DataBase {

	public class DaoClass  implements CustomerDao , BankDao{


    
    
    public DaoClass() {
        super();
    }
    


    public DaoClass(DaoClass dao, CaseIdBean caseIdObj, String caseIdGenOne, String caseIdTotal) {
        super();
        this.dao = dao;
        this.caseIdObj = caseIdObj;
        this.caseIdGenOne = caseIdGenOne;
        this.caseIdTotal = caseIdTotal;
    }



    DaoClass dao = new DaoClass();
    CaseIdBean caseIdObj= new CaseIdBean();
    private static Map<String ,DebitCardTransaction> Debit_Card_Transaction_Details = new HashMap<String , DebitCardTransaction>();
    private static Map<String ,CreditCardTransaction> Credit_Card_Transaction_Details = new HashMap<String , CreditCardTransaction>();
    private static Map<String, CaseIdBean> Query_Details = new HashMap<String, CaseIdBean>();
    private static Map<String, DebitCardBean> Debit_Card_Details = new HashMap<String, DebitCardBean>();
    private static Map<String, CreditCardBean> Credit_Card_Details = new HashMap<String, CreditCardBean>();
    private static Map<BigInteger, CustomerBean> Customer_Details = new HashMap<BigInteger, CustomerBean>();
    
     static long caseIdGenTwo=0;
        String caseIdGenOne=" ";
          String caseIdTotal=" ";
          
          String addToQueryTable(String caseIdGenOne) {
                caseIdTotal = caseIdGenOne+caseIdGenTwo;
                caseIdGenTwo++;
                return caseIdTotal;
                }
    
    
    static{
        
        DebitCardBean debit1= new DebitCardBean(new BigInteger("1234567890"), new BigInteger("1234567891012131"),true, "Laima", 067,1234,LocalDate.now(),"7894561239632587","Platinum");
        DebitCardBean debit2= new DebitCardBean(new BigInteger("1234547890"), new BigInteger("1234562391012131"),true, "Pragya", 057,1034,LocalDate.now(),"7894561239632587","Gold");
        DebitCardBean debit3= new DebitCardBean(new BigInteger("0234567890"), new BigInteger("3234567891012131"),true, "Shubham", 167,2234,LocalDate.now(),"7894561239632587","Silver");
        
        Debit_Card_Details.put(debit1.getDebitCardNumber().toString(),debit1);
        Debit_Card_Details.put(debit2.getDebitCardNumber().toString(),debit2);
        Debit_Card_Details.put(debit3.getDebitCardNumber().toString(),debit3);
        
        CreditCardBean credit1= new CreditCardBean(new BigInteger("9012345678"),new BigInteger("1234567891012132"),true, "Laima",623,9856,LocalDate.now(),"7894561239632587"," ",200,new BigDecimal("1000000.00"),"gfdgfgfdgf" );
        CreditCardBean credit2= new CreditCardBean(new BigInteger("1234567890"),new BigInteger("1234569891012132"),true, "Pragya",683,9056,LocalDate.now(),"7894561239632587"," ",100,new BigDecimal("500000.00"),"gfdgfgfdgf" );
        CreditCardBean credit3= new CreditCardBean(new BigInteger("9018945678"),new BigInteger("2234567891012132"),true, "Mohit",223,9256,LocalDate.now(),"7894561239632587"," ",230,new BigDecimal("100000.00"),"gfdgfgfdgf" );
        
        Credit_Card_Details.put(credit1.getCreditCardNumber().toString(),credit1);
        Credit_Card_Details.put(credit2.getCreditCardNumber().toString(),credit2);
        Credit_Card_Details.put(credit3.getCreditCardNumber().toString(),credit3);
        
        
        CustomerBean cust1 = new CustomerBean(new BigInteger("1234567890"), "7894561239632587","laima","singla","email.@gmail.com","65231351","42165431");
        Customer_Details.put(cust1.getAccountNumber(),cust1);
    }
    
    
    public void newDebitCard(CaseIdBean customIdBean, BigInteger accountNumber) {
        // TODO Auto-generated method stub
           Boolean accountNumberResult= Customer_Details.containsKey(accountNumber);
           if(accountNumberResult) {
               customIdBean.setAccountNumber(accountNumber);
               
               caseIdGenOne="ANDC";
                Date timestamp = new Date ("dd-MM-yyyy HH:mm:ss");
                
                caseIdObj.setCaseIdTotal(dao.addToQueryTable(caseIdGenOne));
                caseIdObj.setCaseTimeStamp(timestamp);
                caseIdObj.setStatusOfQuery("Pending");
                caseIdObj.setUCI(caseIdObj.getUCI());
        Query_Details.put(customIdBean.getCaseIdTotal(),customIdBean);}
           else {
               System.out.println("Account number does not exist");
               
           }
        
    }
    
    @Override
    public void viewAllQueries(CaseIdBean  caseIdObj) {
        
        
        
        }
    
    @Override
    public List<DebitCardBean> viewAllDebitCards() {
        List <DebitCardBean > debitCards = new ArrayList();
        
        
         for(Entry<String, DebitCardBean> entry:Debit_Card_Details.entrySet()) {
        debitCards.add(entry.getValue());}
        return debitCards;
          
        
    }
    
    public List<CreditCardBean> viewAllCreditCards() {
        List <CreditCardBean > creditCards = new ArrayList();
        
        
         for(Entry<String, CreditCardBean> entry:Credit_Card_Details.entrySet()) {
        creditCards.add(entry.getValue());}
        return creditCards;
          







    }







}















}

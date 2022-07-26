/*    */ import java.util.ArrayList;
/*    */ import javax.swing.table.AbstractTableModel;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class CardInfoTableModel
/*    */   extends AbstractTableModel
/*    */ {
/*    */   private static final long serialVersionUID = -4620292293709643235L;
/* 13 */   private String[] columnNames = new String[] { "Index", "ID" };
/* 14 */   private int CountPerPage = 20;
/*    */   
/* 16 */   protected ArrayList<Card> cards = new ArrayList<>();
/*    */ 
/*    */   
/*    */   public int getColumnCount() {
/* 20 */     return this.columnNames.length;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getColumnName(int column) {
/* 25 */     return this.columnNames[column];
/*    */   }
/*    */ 
/*    */   
/*    */   public int getRowCount() {
/* 30 */     return this.cards.size();
/*    */   }
/*    */ 
/*    */   
/*    */   public Object getValueAt(int row, int column) {
/* 35 */     Card music = null;
/* 36 */     if (row >= 0 && row < this.cards.size() && row < this.CountPerPage)
/*    */     {
/* 38 */       music = this.cards.get(row);
/*    */     }
/* 40 */     if (music == null) return null;
/*    */     
/* 42 */     switch (column) {
/*    */       
/*    */       case 0:
/* 45 */         return Integer.valueOf(row + 1);
/*    */       case 1:
/* 47 */         return music.Cardid;
/*    */     } 
/* 49 */     return null;
/*    */   }
/*    */   
/*    */   public String getCardId(int row) {
/* 53 */     return ((Card)this.cards.get(row)).Cardid;
/*    */   }
/*    */ 
/*    */   
/*    */   public void addCard(Card card) {
/* 58 */     this.cards.add(card);
/* 59 */     fireTableDataChanged();
/*    */   }
/*    */ 
/*    */   
/*    */   public void setData(ArrayList<Card> cards) {
/* 64 */     this.cards.clear();
/* 65 */     this.cards.addAll(cards);
/* 66 */     fireTableDataChanged();
/*    */   }
/*    */ 
/*    */   
/*    */   public void refresh() {
/* 71 */     fireTableDataChanged();
/*    */   }
/*    */   
/*    */   public void setCountPerPage(int CountPerPage) {
/* 75 */     this.CountPerPage = CountPerPage;
/*    */   }
/*    */ }


/* Location:              C:\Users\IEUser\Desktop\CardUsingTrial.jar!\CardInfoTableModel.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
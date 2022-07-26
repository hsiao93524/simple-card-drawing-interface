/*    */ import java.util.ArrayList;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class CardUsing
/*    */ {
/*    */   public void Drawdard(ArrayList<Card> deck, ArrayList<Card> hand, ArrayList<Card> deadwood) {
/*  8 */     if (deck.size() == 0) {
/*  9 */       if (deadwood.size() == 0) {
/*    */         return;
/*    */       }
/* 12 */       shuffle(deck, deadwood);
/*    */     } 
/*    */     
/* 15 */     hand.add(deck.get(0));
/* 16 */     deck.remove(0);
/*    */   }
/*    */ 
/*    */   
/*    */   public void shuffle(ArrayList<Card> deck_to, ArrayList<Card> deck_from) {
/* 21 */     int size = deck_from.size();
/* 22 */     for (int i = 0; i < size; i++) {
/* 23 */       int random = (int)(Math.random() * deck_from.size());
/* 24 */       deck_to.add(deck_from.get(random));
/* 25 */       deck_from.remove(random);
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void UseCard(int index, ArrayList<Card> hand, ArrayList<Card> deadwood) {
/* 41 */     if (index < 0)
/* 42 */       return;  deadwood.add(hand.get(index));
/* 43 */     hand.remove(index);
/*    */   }
/*    */   
/*    */   public void addCard(ArrayList<Card> cards) {
/* 47 */     ArrayList<Card> newcards = new ArrayList<>();
/* 48 */     for (int i = 0; i < 10; i++) {
/* 49 */       newcards.add(new Card("Card " + Integer.toString(i)));
/*    */     }
/*    */     
/* 52 */     shuffle(cards, newcards);
/*    */   }
/*    */   
/*    */   public void printcards(ArrayList<Card> cards) {
/* 56 */     for (int i = 0; i < cards.size(); i++)
/* 57 */       System.out.print(String.valueOf(((Card)cards.get(i)).Cardid) + " "); 
/*    */   }
/*    */ }


/* Location:              C:\Users\IEUser\Desktop\CardUsingTrial.jar!\CardUsing.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
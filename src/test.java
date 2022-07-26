/*     */ import java.util.ArrayList;
/*     */ import java.util.Scanner;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class test
/*     */ {
/*     */   public static void main(String[] args) {}
/*     */   
/*     */   public void Drawdard(ArrayList<Card> deck, ArrayList<Card> Hand, ArrayList<Card> deadwood) {
/*  67 */     if (deck.size() == 0) {
/*  68 */       if (deadwood.size() == 0) {
/*     */         return;
/*     */       }
/*  71 */       shuffle(deck, deadwood);
/*     */     } 
/*     */     
/*  74 */     Hand.add(deck.get(0));
/*  75 */     deck.remove(0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void shuffle(ArrayList<Card> deck_to, ArrayList<Card> deck_from) {
/*  80 */     int size = deck_from.size();
/*  81 */     for (int i = 0; i < size; i++) {
/*  82 */       int random = (int)(Math.random() * deck_from.size());
/*  83 */       deck_to.add(deck_from.get(random));
/*  84 */       deck_from.remove(random);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void UseCard(ArrayList<Card> hand, ArrayList<Card> deadwood) {
/*  90 */     System.out.println("card Index:");
/*  91 */     Scanner scanner = new Scanner(System.in);
/*  92 */     int index = scanner.nextInt();
/*     */     
/*  94 */     while (index >= hand.size()) {
/*  95 */       System.out.println("Wrong number");
/*  96 */       System.out.println("card Index: ");
/*  97 */       index = scanner.nextInt();
/*     */     } 
/*     */     
/* 100 */     deadwood.add(hand.get(index));
/* 101 */     hand.remove(index);
/*     */   }
/*     */   
/*     */   public void addCard(ArrayList<Card> cards) {
/* 105 */     ArrayList<Card> newcards = new ArrayList<>();
/* 106 */     for (int i = 0; i < 10; i++) {
/* 107 */       newcards.add(new Card("Card " + Integer.toString(i)));
/*     */     }
/*     */     
/* 110 */     shuffle(cards, newcards);
/*     */   }
/*     */   
/*     */   public void printcards(ArrayList<Card> cards) {
/* 114 */     for (int i = 0; i < cards.size(); i++)
/* 115 */       System.out.print(String.valueOf(((Card)cards.get(i)).Cardid) + " "); 
/*     */   }
/*     */ }


/* Location:              C:\Users\IEUser\Desktop\CardUsingTrial.jar!\test.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
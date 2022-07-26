/*     */ import java.awt.BorderLayout;
/*     */ import java.awt.EventQueue;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.Point;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.MouseAdapter;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.util.ArrayList;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.JTable;
/*     */ import javax.swing.SwingUtilities;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class GUI
/*     */   implements ActionListener
/*     */ {
/*     */   private JFrame frame;
/*     */   private JTable tblDeckCards;
/*     */   private CardInfoTableModel mdlDeckCards;
/*     */   private JTable tblHandCards;
/*     */   private CardInfoTableModel mdlHandCards;
/*     */   private JTable tblDeadwoodCards;
/*     */   private CardInfoTableModel mdlDeadwoodCards;
/*  32 */   ArrayList<Card> deck = new ArrayList<>();
/*  33 */   ArrayList<Card> hand = new ArrayList<>();
/*  34 */   ArrayList<Card> deadwood = new ArrayList<>();
/*  35 */   private JButton btnDraw = new JButton("Draw");
/*  36 */   JButton btnUseCard = new JButton("Use Card");
/*  37 */   JLabel lblCardUsing = new JLabel("");
/*     */   
/*     */   protected int popupX;
/*     */   
/*     */   protected int popupY;
/*     */   
/*     */   public static void main(String[] args) {
/*  44 */     EventQueue.invokeLater(new Runnable() {
/*     */           public void run() {
/*     */             try {
/*  47 */               GUI window = new GUI();
/*  48 */               window.frame.setVisible(true);
/*  49 */             } catch (Exception e) {
/*  50 */               e.printStackTrace();
/*     */             } 
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public GUI() {
/*  60 */     initialize();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void initialize() {
/*  67 */     this.frame = new JFrame();
/*  68 */     this.frame.setResizable(false);
/*  69 */     this.frame.setBounds(100, 100, 450, 350);
/*  70 */     this.frame.setDefaultCloseOperation(3);
/*  71 */     this.frame.getContentPane().setLayout((LayoutManager)null);
/*     */ 
/*     */     
/*  74 */     JLabel lblDeck = new JLabel("deck");
/*  75 */     lblDeck.setBounds(66, 10, 60, 15);
/*  76 */     this.frame.getContentPane().add(lblDeck);
/*     */     
/*  78 */     JPanel pnlDeck = new JPanel();
/*  79 */     pnlDeck.setBounds(51, 35, 80, 180);
/*  80 */     this.frame.getContentPane().add(pnlDeck);
/*  81 */     pnlDeck.setLayout(new BorderLayout(0, 0));
/*     */     
/*  83 */     JScrollPane deckScrollPane = new JScrollPane();
/*  84 */     pnlDeck.add(deckScrollPane, "Center");
/*     */     
/*  86 */     this.mdlDeckCards = new CardInfoTableModel();
/*  87 */     this.tblDeckCards = new JTable(this.mdlDeckCards);
/*  88 */     this.tblDeckCards.getColumnModel().getColumn(0).setPreferredWidth(5);
/*  89 */     deckScrollPane.setViewportView(this.tblDeckCards);
/*     */     
/*  91 */     (new CardUsing()).addCard(this.deck);
/*  92 */     this.mdlDeckCards.setData(this.deck);
/*     */ 
/*     */     
/*  95 */     JLabel lblHand = new JLabel("hand");
/*  96 */     lblHand.setBounds(192, 10, 60, 15);
/*  97 */     this.frame.getContentPane().add(lblHand);
/*     */     
/*  99 */     JPanel pnlHand = new JPanel();
/* 100 */     pnlHand.setBounds(182, 35, 80, 180);
/* 101 */     this.frame.getContentPane().add(pnlHand);
/* 102 */     pnlHand.setLayout(new BorderLayout(0, 0));
/*     */     
/* 104 */     JScrollPane handScrollPane = new JScrollPane();
/* 105 */     handScrollPane.setSize(80, 15);
/* 106 */     handScrollPane.setLocation(182, 0);
/* 107 */     pnlHand.add(handScrollPane, "Center");
/*     */     
/* 109 */     this.mdlHandCards = new CardInfoTableModel();
/* 110 */     this.tblHandCards = new JTable(this.mdlHandCards);
/* 111 */     this.tblHandCards.getColumnModel().getColumn(0).setPreferredWidth(5);
/* 112 */     this.tblHandCards.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mousePressed(MouseEvent e)
/*     */           {
/* 116 */             if (SwingUtilities.isLeftMouseButton(e)) {
/*     */               
/* 118 */               GUI.this.popupX = e.getX();
/* 119 */               GUI.this.popupY = e.getY();
/*     */             }
/* 121 */             else if (SwingUtilities.isRightMouseButton(e)) {
/*     */             
/*     */             }  }
/*     */         });
/* 125 */     handScrollPane.setViewportView(this.tblHandCards);
/*     */     
/* 127 */     this.mdlHandCards.setData(this.hand);
/*     */ 
/*     */     
/* 130 */     JLabel lblDeadwood = new JLabel("deadwood");
/* 131 */     lblDeadwood.setBounds(318, 10, 60, 15);
/* 132 */     this.frame.getContentPane().add(lblDeadwood);
/*     */     
/* 134 */     JPanel pnlDeadwood = new JPanel();
/* 135 */     pnlDeadwood.setBounds(313, 35, 80, 180);
/* 136 */     this.frame.getContentPane().add(pnlDeadwood);
/* 137 */     pnlDeadwood.setLayout(new BorderLayout(0, 0));
/*     */     
/* 139 */     JScrollPane deadwoodScrollPane = new JScrollPane();
/* 140 */     pnlDeadwood.add(deadwoodScrollPane, "Center");
/*     */     
/* 142 */     this.mdlDeadwoodCards = new CardInfoTableModel();
/* 143 */     this.tblDeadwoodCards = new JTable(this.mdlDeadwoodCards);
/* 144 */     this.tblDeadwoodCards.getColumnModel().getColumn(0).setPreferredWidth(5);
/* 145 */     deadwoodScrollPane.setViewportView(this.tblDeadwoodCards);
/*     */     
/* 147 */     this.mdlDeadwoodCards.setData(this.deadwood);
/*     */ 
/*     */     
/* 150 */     this.btnDraw.addActionListener(this);
/* 151 */     this.btnDraw.setBounds(90, 239, 87, 23);
/* 152 */     this.frame.getContentPane().add(this.btnDraw);
/*     */     
/* 154 */     this.btnUseCard.addActionListener(this);
/* 155 */     this.btnUseCard.setBounds(267, 239, 87, 23);
/* 156 */     this.frame.getContentPane().add(this.btnUseCard);
/*     */     
/* 158 */     this.lblCardUsing.setBounds(267, 225, 87, 15);
/* 159 */     this.frame.getContentPane().add(this.lblCardUsing);
/*     */   }
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
/*     */   public void actionPerformed(ActionEvent e) {
/* 172 */     JButton btn = (JButton)e.getSource();
/* 173 */     if (btn == this.btnDraw) {
/* 174 */       (new CardUsing()).Drawdard(this.deck, this.hand, this.deadwood);
/* 175 */     } else if (btn == this.btnUseCard) {
/* 176 */       this.lblCardUsing.setText("Card " + (this.tblHandCards.rowAtPoint(new Point(this.popupX, this.popupY)) + 1) + " Used.");
/* 177 */       Point pointofindex = new Point(this.popupX, this.popupY);
/* 178 */       (new CardUsing()).UseCard(this.tblHandCards.rowAtPoint(pointofindex), this.hand, this.deadwood);
/* 179 */       this.popupX = 0;
/* 180 */       this.popupY = 0;
/*     */     } 
/*     */ 
/*     */     
/* 184 */     this.mdlDeckCards.setData(this.deck);
/* 185 */     this.mdlHandCards.setData(this.hand);
/* 186 */     this.mdlDeadwoodCards.setData(this.deadwood);
/*     */   }
/*     */ }


/* Location:              C:\Users\IEUser\Desktop\CardUsingTrial.jar!\GUI.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
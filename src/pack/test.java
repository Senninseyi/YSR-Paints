/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import com.placeholder.PlaceHolder;
import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author lupinthe3rd
 */
public class test extends javax.swing.JFrame {

    PlaceHolder holder;
    /**
     * Creates new form test
     */
    
    
    
    public test() {
        initComponents();
        setTitle("paint-inventory-app");
        setLocationRelativeTo(null);
        setResizable(false);
        
        // place holder for login form
        
        // placeholders for username and password
        holder = new PlaceHolder(uname, "Enter your username");
        holder = new PlaceHolder(pword, "Enter your password");
        // placeholders for username and password
        
        
        // placeholders for add product
        
        // place holder for login form

    }
    

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        products = new javax.swing.JPanel();
        pAV = new javax.swing.JPanel();
        pAddp = new javax.swing.JPanel();
        dateAdded = new javax.swing.JTextField();
        producerName = new javax.swing.JTextField();
        masterCode = new javax.swing.JTextField();
        costPrice = new javax.swing.JTextField();
        sellingPrice = new javax.swing.JTextField();
        paintColor = new javax.swing.JTextField();
        litres = new javax.swing.JTextField();
        paintCode = new javax.swing.JTextField();
        paintType = new javax.swing.JTextField();
        productType = new javax.swing.JTextField();
        bcgproTy = new javax.swing.JLabel();
        bcgpaTy = new javax.swing.JLabel();
        bcgpaCo = new javax.swing.JLabel();
        bcgltrs = new javax.swing.JLabel();
        bcgpaCol = new javax.swing.JLabel();
        bcgsellP = new javax.swing.JLabel();
        bcgcostp = new javax.swing.JLabel();
        bcgmasCod = new javax.swing.JLabel();
        bcgproducer = new javax.swing.JLabel();
        bcgDate = new javax.swing.JLabel();
        bcgproductAdd = new javax.swing.JLabel();
        pViewp = new javax.swing.JPanel();
        dateAdded2 = new javax.swing.JTextField();
        producerName2 = new javax.swing.JTextField();
        masterCode2 = new javax.swing.JTextField();
        costPrice2 = new javax.swing.JTextField();
        sellingPrice2 = new javax.swing.JTextField();
        paintColor2 = new javax.swing.JTextField();
        litres2 = new javax.swing.JTextField();
        paintCode2 = new javax.swing.JTextField();
        paintType2 = new javax.swing.JTextField();
        productType2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        bcgproTy2 = new javax.swing.JLabel();
        bcgpaTy2 = new javax.swing.JLabel();
        bcgpaCo2 = new javax.swing.JLabel();
        bcgltrs2 = new javax.swing.JLabel();
        bcgpaCol2 = new javax.swing.JLabel();
        bcgsellP2 = new javax.swing.JLabel();
        bcgcostp2 = new javax.swing.JLabel();
        bcgmasCod2 = new javax.swing.JLabel();
        bcgproducer2 = new javax.swing.JLabel();
        bcgDate2 = new javax.swing.JLabel();
        bcgaddImg2 = new javax.swing.JLabel();
        bcgproductAdd2 = new javax.swing.JLabel();
        sidebar = new javax.swing.JPanel();
        menuProducts = new javax.swing.JLabel();
        whiteBcgg = new javax.swing.JLabel();
        btnViewprdt = new javax.swing.JLabel();
        btnAddprdt = new javax.swing.JLabel();
        btnback = new javax.swing.JLabel();
        clr2 = new javax.swing.JLabel();
        bcgWhite1 = new javax.swing.JLabel();
        bcg3 = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        p1 = new javax.swing.JPanel();
        m_prdts = new javax.swing.JLabel();
        m_cuts = new javax.swing.JLabel();
        m_manAdm = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        clr1 = new javax.swing.JLabel();
        bcgWhite = new javax.swing.JLabel();
        bcg1 = new javax.swing.JLabel();
        overview = new javax.swing.JPanel();
        formPanel = new javax.swing.JPanel();
        signinform = new javax.swing.JPanel();
        settings = new javax.swing.JLabel();
        gobtn = new javax.swing.JLabel();
        pword = new javax.swing.JPasswordField();
        uname = new javax.swing.JTextField();
        roundrect5 = new javax.swing.JLabel();
        roundrect = new javax.swing.JLabel();
        mock = new javax.swing.JLabel();
        logoName = new javax.swing.JLabel();
        clr = new javax.swing.JLabel();
        bcg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setLayout(new java.awt.CardLayout());

        products.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pAV.setOpaque(false);
        pAV.setLayout(new java.awt.CardLayout());

        pAddp.setOpaque(false);
        pAddp.setPreferredSize(new java.awt.Dimension(1022, 492));
        pAddp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dateAdded.setBorder(null);
        pAddp.add(dateAdded, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 305, 225, 38));

        producerName.setBorder(null);
        pAddp.add(producerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 305, 210, 38));

        masterCode.setBorder(null);
        pAddp.add(masterCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 305, 120, 38));

        costPrice.setBorder(null);
        pAddp.add(costPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(708, 190, 160, 38));

        sellingPrice.setBorder(null);
        pAddp.add(sellingPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 190, 160, 38));

        paintColor.setBorder(null);
        pAddp.add(paintColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 180, 38));

        litres.setBorder(null);
        pAddp.add(litres, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 75, 80, 38));

        paintCode.setBorder(null);
        pAddp.add(paintCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 75, 130, 38));

        paintType.setBorder(null);
        pAddp.add(paintType, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 75, 130, 38));

        productType.setBorder(null);
        pAddp.add(productType, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 75, 130, 38));

        bcgproTy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgproTy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/proTy.png"))); // NOI18N
        pAddp.add(bcgproTy, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        bcgpaTy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgpaTy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/paTy.png"))); // NOI18N
        pAddp.add(bcgpaTy, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        bcgpaCo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgpaCo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/paCo.png"))); // NOI18N
        pAddp.add(bcgpaCo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, -1));

        bcgltrs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgltrs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/litres.png"))); // NOI18N
        pAddp.add(bcgltrs, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, -1, -1));

        bcgpaCol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgpaCol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/paCol.png"))); // NOI18N
        pAddp.add(bcgpaCol, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 145, -1, -1));

        bcgsellP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgsellP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/sellingPrice.png"))); // NOI18N
        pAddp.add(bcgsellP, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 145, -1, -1));

        bcgcostp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgcostp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/costPrice.png"))); // NOI18N
        pAddp.add(bcgcostp, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 145, -1, -1));

        bcgmasCod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgmasCod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/masterCode.png"))); // NOI18N
        pAddp.add(bcgmasCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        bcgproducer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgproducer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/producer.png"))); // NOI18N
        pAddp.add(bcgproducer, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        bcgDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/date.png"))); // NOI18N
        pAddp.add(bcgDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, -1, -1));

        bcgproductAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgproductAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/btnProduct.png"))); // NOI18N
        pAddp.add(bcgproductAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, -1, -1));

        pAV.add(pAddp, "card2");

        pViewp.setOpaque(false);
        pViewp.setPreferredSize(new java.awt.Dimension(1022, 492));
        pViewp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dateAdded2.setEditable(false);
        dateAdded2.setBorder(null);
        pViewp.add(dateAdded2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 305, 225, 38));

        producerName2.setEditable(false);
        producerName2.setBorder(null);
        pViewp.add(producerName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 305, 210, 38));

        masterCode2.setEditable(false);
        masterCode2.setBorder(null);
        pViewp.add(masterCode2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 305, 120, 38));

        costPrice2.setEditable(false);
        costPrice2.setBorder(null);
        pViewp.add(costPrice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(708, 190, 160, 38));

        sellingPrice2.setEditable(false);
        sellingPrice2.setBorder(null);
        pViewp.add(sellingPrice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 190, 160, 38));

        paintColor2.setEditable(false);
        paintColor2.setBorder(null);
        pViewp.add(paintColor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 180, 38));

        litres2.setEditable(false);
        litres2.setBorder(null);
        pViewp.add(litres2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 75, 80, 38));

        paintCode2.setEditable(false);
        paintCode2.setBorder(null);
        pViewp.add(paintCode2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 75, 130, 38));

        paintType2.setEditable(false);
        paintType2.setBorder(null);
        pViewp.add(paintType2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 75, 130, 38));

        productType2.setEditable(false);
        productType2.setBorder(null);
        pViewp.add(productType2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 75, 130, 38));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/updatedimg.png"))); // NOI18N
        pViewp.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));

        bcgproTy2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgproTy2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/proTy.png"))); // NOI18N
        pViewp.add(bcgproTy2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        bcgpaTy2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgpaTy2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/paTy.png"))); // NOI18N
        pViewp.add(bcgpaTy2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        bcgpaCo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgpaCo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/paCo.png"))); // NOI18N
        pViewp.add(bcgpaCo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, -1));

        bcgltrs2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgltrs2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/litres.png"))); // NOI18N
        pViewp.add(bcgltrs2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, -1, -1));

        bcgpaCol2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgpaCol2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/paCol.png"))); // NOI18N
        pViewp.add(bcgpaCol2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 145, -1, -1));

        bcgsellP2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgsellP2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/sellingPrice.png"))); // NOI18N
        pViewp.add(bcgsellP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 145, -1, -1));

        bcgcostp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgcostp2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/costPrice.png"))); // NOI18N
        pViewp.add(bcgcostp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 145, -1, -1));

        bcgmasCod2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgmasCod2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/masterCode.png"))); // NOI18N
        pViewp.add(bcgmasCod2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        bcgproducer2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgproducer2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/producer.png"))); // NOI18N
        pViewp.add(bcgproducer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        bcgDate2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgDate2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/date.png"))); // NOI18N
        pViewp.add(bcgDate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, -1, -1));

        bcgaddImg2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgaddImg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/editProduct.png"))); // NOI18N
        pViewp.add(bcgaddImg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, -1, -1));

        bcgproductAdd2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgproductAdd2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/savept.png"))); // NOI18N
        pViewp.add(bcgproductAdd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, -1, -1));

        pAV.add(pViewp, "card3");

        products.add(pAV, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 1080, 530));

        sidebar.setOpaque(false);
        sidebar.setPreferredSize(new java.awt.Dimension(55, 565));
        sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuProducts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/mP.png"))); // NOI18N
        sidebar.add(menuProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        products.add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 69, -1, -1));

        whiteBcgg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        whiteBcgg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Rectangle1.png"))); // NOI18N
        products.add(whiteBcgg, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 140, -1, -1));

        btnViewprdt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnViewprdt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/SubMenu2.png"))); // NOI18N
        btnViewprdt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewprdtMouseClicked(evt);
            }
        });
        products.add(btnViewprdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 70, -1, -1));

        btnAddprdt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAddprdt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/SubMenu1.png"))); // NOI18N
        btnAddprdt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddprdtMouseClicked(evt);
            }
        });
        products.add(btnAddprdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        btnback.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Back.png"))); // NOI18N
        products.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 60, -1, -1));

        clr2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clr2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/2018 ©ysr company li.png"))); // NOI18N
        products.add(clr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 710, -1, -1));

        bcgWhite1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgWhite1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Rectangle.png"))); // NOI18N
        products.add(bcgWhite1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, -1, -1));

        bcg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Group.png"))); // NOI18N
        products.add(bcg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mainPanel.add(products, "card4");

        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p1.setOpaque(false);
        p1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        m_prdts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        m_prdts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/products.png"))); // NOI18N
        p1.add(m_prdts, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        m_cuts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        m_cuts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/customers.png"))); // NOI18N
        p1.add(m_cuts, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, -1));

        m_manAdm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        m_manAdm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/manageAdmins.png"))); // NOI18N
        p1.add(m_manAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 60, -1, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/menu.png"))); // NOI18N
        p1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 330, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/menu.png"))); // NOI18N
        p1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/menu.png"))); // NOI18N
        p1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));

        menu.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 1160, 620));

        clr1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clr1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/2018 ©ysr company li.png"))); // NOI18N
        menu.add(clr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 710, -1, -1));

        bcgWhite.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgWhite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Rectangle.png"))); // NOI18N
        menu.add(bcgWhite, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, -1, -1));

        bcg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Group.png"))); // NOI18N
        menu.add(bcg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mainPanel.add(menu, "card5");

        overview.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        formPanel.setOpaque(false);
        formPanel.setLayout(new java.awt.CardLayout());

        signinform.setOpaque(false);
        signinform.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        settings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/left.png"))); // NOI18N
        signinform.add(settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        gobtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gobtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/right.png"))); // NOI18N
        signinform.add(gobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, -1, -1));

        pword.setFont(new java.awt.Font("Futura Hv BT", 0, 15)); // NOI18N
        pword.setBorder(null);
        signinform.add(pword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 282, 50));

        uname.setFont(new java.awt.Font("Futura Hv BT", 0, 15)); // NOI18N
        uname.setBorder(null);
        signinform.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 282, 50));

        roundrect5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roundrect5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/tect.png"))); // NOI18N
        signinform.add(roundrect5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 440, 140));

        roundrect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roundrect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/tect.png"))); // NOI18N
        signinform.add(roundrect, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 440, 140));

        formPanel.add(signinform, "card2");

        overview.add(formPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 490, 560));

        mock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/mcokup-2.png"))); // NOI18N
        overview.add(mock, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 160, -1, -1));

        logoName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Inventory Management.png"))); // NOI18N
        overview.add(logoName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 470, 60));

        clr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/2018 ©ysr company li.png"))); // NOI18N
        overview.add(clr, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 680, -1, -1));

        bcg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Group.png"))); // NOI18N
        overview.add(bcg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mainPanel.add(overview, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewprdtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewprdtMouseClicked

        btnViewprdt.setIcon(new ImageIcon(getClass().getResource("/pack/image/viewprdt.png")));
        btnAddprdt.setIcon(new ImageIcon(getClass().getResource("/pack/image/addPrdt.png")));
        
        pAV.removeAll();
        pAV.validate();
        pAV.repaint();
        pAV.add(pViewp);
        pAV.revalidate();
        pAV.repaint();
    }//GEN-LAST:event_btnViewprdtMouseClicked

    private void btnAddprdtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddprdtMouseClicked
        btnViewprdt.setIcon(new ImageIcon(getClass().getResource("/pack/image/SubMenu2.png")));
        btnAddprdt.setIcon(new ImageIcon(getClass().getResource("/pack/image/SubMenu1.png")));
        
        pAV.removeAll();
        pAV.validate();
        pAV.repaint();
        pAV.add(pAddp);
        pAV.revalidate();
        pAV.repaint();
    }//GEN-LAST:event_btnAddprdtMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bcg;
    private javax.swing.JLabel bcg1;
    private javax.swing.JLabel bcg3;
    private javax.swing.JLabel bcgDate;
    private javax.swing.JLabel bcgDate2;
    private javax.swing.JLabel bcgWhite;
    private javax.swing.JLabel bcgWhite1;
    private javax.swing.JLabel bcgaddImg2;
    private javax.swing.JLabel bcgcostp;
    private javax.swing.JLabel bcgcostp2;
    private javax.swing.JLabel bcgltrs;
    private javax.swing.JLabel bcgltrs2;
    private javax.swing.JLabel bcgmasCod;
    private javax.swing.JLabel bcgmasCod2;
    private javax.swing.JLabel bcgpaCo;
    private javax.swing.JLabel bcgpaCo2;
    private javax.swing.JLabel bcgpaCol;
    private javax.swing.JLabel bcgpaCol2;
    private javax.swing.JLabel bcgpaTy;
    private javax.swing.JLabel bcgpaTy2;
    private javax.swing.JLabel bcgproTy;
    private javax.swing.JLabel bcgproTy2;
    private javax.swing.JLabel bcgproducer;
    private javax.swing.JLabel bcgproducer2;
    private javax.swing.JLabel bcgproductAdd;
    private javax.swing.JLabel bcgproductAdd2;
    private javax.swing.JLabel bcgsellP;
    private javax.swing.JLabel bcgsellP2;
    private javax.swing.JLabel btnAddprdt;
    private javax.swing.JLabel btnViewprdt;
    private javax.swing.JLabel btnback;
    private javax.swing.JLabel clr;
    private javax.swing.JLabel clr1;
    private javax.swing.JLabel clr2;
    private javax.swing.JTextField costPrice;
    private javax.swing.JTextField costPrice2;
    private javax.swing.JTextField dateAdded;
    private javax.swing.JTextField dateAdded2;
    private javax.swing.JPanel formPanel;
    private javax.swing.JLabel gobtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField litres;
    private javax.swing.JTextField litres2;
    private javax.swing.JLabel logoName;
    private javax.swing.JLabel m_cuts;
    private javax.swing.JLabel m_manAdm;
    private javax.swing.JLabel m_prdts;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField masterCode;
    private javax.swing.JTextField masterCode2;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel menuProducts;
    private javax.swing.JLabel mock;
    private javax.swing.JPanel overview;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel pAV;
    private javax.swing.JPanel pAddp;
    private javax.swing.JPanel pViewp;
    private javax.swing.JTextField paintCode;
    private javax.swing.JTextField paintCode2;
    private javax.swing.JTextField paintColor;
    private javax.swing.JTextField paintColor2;
    private javax.swing.JTextField paintType;
    private javax.swing.JTextField paintType2;
    private javax.swing.JTextField producerName;
    private javax.swing.JTextField producerName2;
    private javax.swing.JTextField productType;
    private javax.swing.JTextField productType2;
    private javax.swing.JPanel products;
    private javax.swing.JPasswordField pword;
    private javax.swing.JLabel roundrect;
    private javax.swing.JLabel roundrect5;
    private javax.swing.JTextField sellingPrice;
    private javax.swing.JTextField sellingPrice2;
    private javax.swing.JLabel settings;
    private javax.swing.JPanel sidebar;
    private javax.swing.JPanel signinform;
    private javax.swing.JTextField uname;
    private javax.swing.JLabel whiteBcgg;
    // End of variables declaration//GEN-END:variables
}
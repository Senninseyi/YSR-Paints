/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import com.placeholder.PlaceHolder;
import java.awt.Color;

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
        addproducts = new javax.swing.JPanel();
        p2 = new javax.swing.JPanel();
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
        sidebar = new javax.swing.JPanel();
        whiteBcgg = new javax.swing.JLabel();
        btnViewprdt = new javax.swing.JLabel();
        btnAddprdt = new javax.swing.JLabel();
        btnback = new javax.swing.JLabel();
        clr2 = new javax.swing.JLabel();
        bcgWhite1 = new javax.swing.JLabel();
        bcg3 = new javax.swing.JLabel();
        viewsingleproducts = new javax.swing.JPanel();
        p3 = new javax.swing.JPanel();
        dateAdded1 = new javax.swing.JTextField();
        producerName1 = new javax.swing.JTextField();
        masterCode1 = new javax.swing.JTextField();
        costPrice1 = new javax.swing.JTextField();
        sellingPrice1 = new javax.swing.JTextField();
        paintColor1 = new javax.swing.JTextField();
        litres1 = new javax.swing.JTextField();
        paintCode1 = new javax.swing.JTextField();
        paintType1 = new javax.swing.JTextField();
        productType1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bcgproTy1 = new javax.swing.JLabel();
        bcgpaTy1 = new javax.swing.JLabel();
        bcgpaCo1 = new javax.swing.JLabel();
        bcgltrs1 = new javax.swing.JLabel();
        bcgpaCol1 = new javax.swing.JLabel();
        bcgsellP1 = new javax.swing.JLabel();
        bcgcostp1 = new javax.swing.JLabel();
        bcgmasCod1 = new javax.swing.JLabel();
        bcgproducer1 = new javax.swing.JLabel();
        bcgDate1 = new javax.swing.JLabel();
        bcgaddImg1 = new javax.swing.JLabel();
        bcgproductAdd1 = new javax.swing.JLabel();
        vBack = new javax.swing.JLabel();
        vViewprdt = new javax.swing.JLabel();
        vAddprdt = new javax.swing.JLabel();
        whiteBcgg1 = new javax.swing.JLabel();
        clr3 = new javax.swing.JLabel();
        bcgWhite2 = new javax.swing.JLabel();
        bcg4 = new javax.swing.JLabel();
        sidebar1 = new javax.swing.JPanel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setLayout(new java.awt.CardLayout());

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

        addproducts.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p2.setOpaque(false);
        p2.setPreferredSize(new java.awt.Dimension(1022, 492));
        p2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dateAdded.setBorder(null);
        p2.add(dateAdded, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 305, 225, 38));

        producerName.setBorder(null);
        p2.add(producerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 305, 210, 38));

        masterCode.setBorder(null);
        p2.add(masterCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 305, 120, 38));

        costPrice.setBorder(null);
        p2.add(costPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(708, 190, 160, 38));

        sellingPrice.setBorder(null);
        p2.add(sellingPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 190, 160, 38));

        paintColor.setBorder(null);
        p2.add(paintColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 180, 38));

        litres.setBorder(null);
        p2.add(litres, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 75, 80, 38));

        paintCode.setBorder(null);
        p2.add(paintCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 75, 130, 38));

        paintType.setBorder(null);
        p2.add(paintType, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 75, 130, 38));

        productType.setBorder(null);
        p2.add(productType, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 75, 130, 38));

        bcgproTy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgproTy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/proTy.png"))); // NOI18N
        p2.add(bcgproTy, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        bcgpaTy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgpaTy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/paTy.png"))); // NOI18N
        p2.add(bcgpaTy, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        bcgpaCo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgpaCo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/paCo.png"))); // NOI18N
        p2.add(bcgpaCo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, -1));

        bcgltrs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgltrs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/litres.png"))); // NOI18N
        p2.add(bcgltrs, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, -1, -1));

        bcgpaCol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgpaCol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/paCol.png"))); // NOI18N
        p2.add(bcgpaCol, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 145, -1, -1));

        bcgsellP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgsellP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/sellingPrice.png"))); // NOI18N
        p2.add(bcgsellP, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 145, -1, -1));

        bcgcostp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgcostp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/costPrice.png"))); // NOI18N
        p2.add(bcgcostp, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 145, -1, -1));

        bcgmasCod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgmasCod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/masterCode.png"))); // NOI18N
        p2.add(bcgmasCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        bcgproducer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgproducer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/producer.png"))); // NOI18N
        p2.add(bcgproducer, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        bcgDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/date.png"))); // NOI18N
        p2.add(bcgDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, -1, -1));

        bcgproductAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgproductAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/btnProduct.png"))); // NOI18N
        p2.add(bcgproductAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, -1, -1));

        addproducts.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 140, -1, -1));

        sidebar.setOpaque(false);
        sidebar.setPreferredSize(new java.awt.Dimension(55, 565));
        sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        addproducts.add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 69, -1, -1));

        whiteBcgg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        whiteBcgg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Rectangle1.png"))); // NOI18N
        addproducts.add(whiteBcgg, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 140, -1, -1));

        btnViewprdt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnViewprdt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/SubMenu2.png"))); // NOI18N
        addproducts.add(btnViewprdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 70, -1, -1));

        btnAddprdt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAddprdt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/SubMenu1.png"))); // NOI18N
        addproducts.add(btnAddprdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        btnback.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Back.png"))); // NOI18N
        addproducts.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 60, -1, -1));

        clr2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clr2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/2018 ©ysr company li.png"))); // NOI18N
        addproducts.add(clr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 710, -1, -1));

        bcgWhite1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgWhite1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Rectangle.png"))); // NOI18N
        addproducts.add(bcgWhite1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, -1, -1));

        bcg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Group.png"))); // NOI18N
        addproducts.add(bcg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mainPanel.add(addproducts, "card4");

        viewsingleproducts.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p3.setOpaque(false);
        p3.setPreferredSize(new java.awt.Dimension(1022, 492));
        p3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dateAdded1.setEditable(false);
        dateAdded1.setBorder(null);
        p3.add(dateAdded1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 305, 225, 38));

        producerName1.setEditable(false);
        producerName1.setBorder(null);
        p3.add(producerName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 305, 210, 38));

        masterCode1.setEditable(false);
        masterCode1.setBorder(null);
        p3.add(masterCode1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 305, 120, 38));

        costPrice1.setEditable(false);
        costPrice1.setBorder(null);
        p3.add(costPrice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(708, 190, 160, 38));

        sellingPrice1.setEditable(false);
        sellingPrice1.setBorder(null);
        p3.add(sellingPrice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 190, 160, 38));

        paintColor1.setEditable(false);
        paintColor1.setBorder(null);
        p3.add(paintColor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 180, 38));

        litres1.setEditable(false);
        litres1.setBorder(null);
        p3.add(litres1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 75, 80, 38));

        paintCode1.setEditable(false);
        paintCode1.setBorder(null);
        p3.add(paintCode1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 75, 130, 38));

        paintType1.setEditable(false);
        paintType1.setBorder(null);
        p3.add(paintType1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 75, 130, 38));

        productType1.setEditable(false);
        productType1.setBorder(null);
        p3.add(productType1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 75, 130, 38));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/updatedimg.png"))); // NOI18N
        p3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));

        bcgproTy1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgproTy1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/proTy.png"))); // NOI18N
        p3.add(bcgproTy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        bcgpaTy1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgpaTy1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/paTy.png"))); // NOI18N
        p3.add(bcgpaTy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        bcgpaCo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgpaCo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/paCo.png"))); // NOI18N
        p3.add(bcgpaCo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, -1));

        bcgltrs1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgltrs1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/litres.png"))); // NOI18N
        p3.add(bcgltrs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, -1, -1));

        bcgpaCol1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgpaCol1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/paCol.png"))); // NOI18N
        p3.add(bcgpaCol1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 145, -1, -1));

        bcgsellP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgsellP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/sellingPrice.png"))); // NOI18N
        p3.add(bcgsellP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 145, -1, -1));

        bcgcostp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgcostp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/costPrice.png"))); // NOI18N
        p3.add(bcgcostp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 145, -1, -1));

        bcgmasCod1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgmasCod1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/masterCode.png"))); // NOI18N
        p3.add(bcgmasCod1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        bcgproducer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgproducer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/producer.png"))); // NOI18N
        p3.add(bcgproducer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        bcgDate1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgDate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/date.png"))); // NOI18N
        p3.add(bcgDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, -1, -1));

        bcgaddImg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgaddImg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/editProduct.png"))); // NOI18N
        p3.add(bcgaddImg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, -1, -1));

        bcgproductAdd1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgproductAdd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/savept.png"))); // NOI18N
        p3.add(bcgproductAdd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, -1, -1));

        viewsingleproducts.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 140, -1, -1));

        vBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Back.png"))); // NOI18N
        viewsingleproducts.add(vBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 60, -1, -1));

        vViewprdt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vViewprdt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/viewprdt.png"))); // NOI18N
        viewsingleproducts.add(vViewprdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 70, -1, -1));

        vAddprdt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vAddprdt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/addPrdt.png"))); // NOI18N
        viewsingleproducts.add(vAddprdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        whiteBcgg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        whiteBcgg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Rectangle1.png"))); // NOI18N
        viewsingleproducts.add(whiteBcgg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 140, -1, -1));

        clr3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clr3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/2018 ©ysr company li.png"))); // NOI18N
        viewsingleproducts.add(clr3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 710, -1, -1));

        bcgWhite2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgWhite2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Rectangle.png"))); // NOI18N
        viewsingleproducts.add(bcgWhite2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, -1, -1));

        bcg4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Group.png"))); // NOI18N
        viewsingleproducts.add(bcg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        sidebar1.setOpaque(false);
        sidebar1.setPreferredSize(new java.awt.Dimension(55, 565));

        javax.swing.GroupLayout sidebar1Layout = new javax.swing.GroupLayout(sidebar1);
        sidebar1.setLayout(sidebar1Layout);
        sidebar1Layout.setHorizontalGroup(
            sidebar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        sidebar1Layout.setVerticalGroup(
            sidebar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
        );

        viewsingleproducts.add(sidebar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 69, -1, -1));

        mainPanel.add(viewsingleproducts, "card5");

        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p1.setOpaque(false);
        p1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        m_prdts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        m_prdts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/M1.png"))); // NOI18N
        p1.add(m_prdts, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        m_cuts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        m_cuts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/M2.png"))); // NOI18N
        p1.add(m_cuts, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, -1));

        m_manAdm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        m_manAdm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/M3.png"))); // NOI18N
        p1.add(m_manAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 60, -1, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/M_sample.png"))); // NOI18N
        p1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 330, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/M_sample.png"))); // NOI18N
        p1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/M_sample.png"))); // NOI18N
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
    private javax.swing.JPanel addproducts;
    private javax.swing.JLabel bcg;
    private javax.swing.JLabel bcg1;
    private javax.swing.JLabel bcg3;
    private javax.swing.JLabel bcg4;
    private javax.swing.JLabel bcgDate;
    private javax.swing.JLabel bcgDate1;
    private javax.swing.JLabel bcgWhite;
    private javax.swing.JLabel bcgWhite1;
    private javax.swing.JLabel bcgWhite2;
    private javax.swing.JLabel bcgaddImg1;
    private javax.swing.JLabel bcgcostp;
    private javax.swing.JLabel bcgcostp1;
    private javax.swing.JLabel bcgltrs;
    private javax.swing.JLabel bcgltrs1;
    private javax.swing.JLabel bcgmasCod;
    private javax.swing.JLabel bcgmasCod1;
    private javax.swing.JLabel bcgpaCo;
    private javax.swing.JLabel bcgpaCo1;
    private javax.swing.JLabel bcgpaCol;
    private javax.swing.JLabel bcgpaCol1;
    private javax.swing.JLabel bcgpaTy;
    private javax.swing.JLabel bcgpaTy1;
    private javax.swing.JLabel bcgproTy;
    private javax.swing.JLabel bcgproTy1;
    private javax.swing.JLabel bcgproducer;
    private javax.swing.JLabel bcgproducer1;
    private javax.swing.JLabel bcgproductAdd;
    private javax.swing.JLabel bcgproductAdd1;
    private javax.swing.JLabel bcgsellP;
    private javax.swing.JLabel bcgsellP1;
    private javax.swing.JLabel btnAddprdt;
    private javax.swing.JLabel btnViewprdt;
    private javax.swing.JLabel btnback;
    private javax.swing.JLabel clr;
    private javax.swing.JLabel clr1;
    private javax.swing.JLabel clr2;
    private javax.swing.JLabel clr3;
    private javax.swing.JTextField costPrice;
    private javax.swing.JTextField costPrice1;
    private javax.swing.JTextField dateAdded;
    private javax.swing.JTextField dateAdded1;
    private javax.swing.JPanel formPanel;
    private javax.swing.JLabel gobtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField litres;
    private javax.swing.JTextField litres1;
    private javax.swing.JLabel logoName;
    private javax.swing.JLabel m_cuts;
    private javax.swing.JLabel m_manAdm;
    private javax.swing.JLabel m_prdts;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField masterCode;
    private javax.swing.JTextField masterCode1;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel mock;
    private javax.swing.JPanel overview;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JTextField paintCode;
    private javax.swing.JTextField paintCode1;
    private javax.swing.JTextField paintColor;
    private javax.swing.JTextField paintColor1;
    private javax.swing.JTextField paintType;
    private javax.swing.JTextField paintType1;
    private javax.swing.JTextField producerName;
    private javax.swing.JTextField producerName1;
    private javax.swing.JTextField productType;
    private javax.swing.JTextField productType1;
    private javax.swing.JPasswordField pword;
    private javax.swing.JLabel roundrect;
    private javax.swing.JLabel roundrect5;
    private javax.swing.JTextField sellingPrice;
    private javax.swing.JTextField sellingPrice1;
    private javax.swing.JLabel settings;
    private javax.swing.JPanel sidebar;
    private javax.swing.JPanel sidebar1;
    private javax.swing.JPanel signinform;
    private javax.swing.JTextField uname;
    private javax.swing.JLabel vAddprdt;
    private javax.swing.JLabel vBack;
    private javax.swing.JLabel vViewprdt;
    private javax.swing.JPanel viewsingleproducts;
    private javax.swing.JLabel whiteBcgg;
    private javax.swing.JLabel whiteBcgg1;
    // End of variables declaration//GEN-END:variables
}
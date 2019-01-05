/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import com.placeholder.PlaceHolder;
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
        ViewCustomers();
        viewProduct();
        
       
        
    }
    
    public void ViewCustomers(){
        RectangleModal.setVisible(false);
        customerRectangle1.setVisible(false);
        clear_customer.setVisible(false);
        editCustomer.setVisible(false);
        saveCustomer.setVisible(false);
        deleteOval.setVisible(false);
        
        //placeholders
        BusinessName1.setVisible(false);
        title1.setVisible(false);
        surname1.setVisible(false);
        othername1.setVisible(false);
        firstname1.setVisible(false);
        address1.setVisible(false);
        phonenumber1.setVisible(false);
        customer_email1.setVisible(false);
        pricecategory1.setVisible(false);
        creditlimit1.setVisible(false);
        openingBalance1.setVisible(false);
        ledgerName1.setVisible(false);
        regulate1.setVisible(false);
        
        //TextFields
        BusinessName_field1.setVisible(false);
        title_field1.setVisible(false);
        surname_field1.setVisible(false);
        others_field1.setVisible(false);
        firstname_field1.setVisible(false);
        address_field1.setVisible(false);
        phonenumber_field1.setVisible(false);
        email_field1.setVisible(false);
        pricecategory_field1.setVisible(false);
        creditLimit_field1.setVisible(false);
        openingBalance_field1.setVisible(false);
        ledgerName_field1.setVisible(false);
        regulate_field1.setVisible(false);
    }
    
    public void VisibleCustomers(){
        RectangleModal.setVisible(true);
        customerRectangle1.setVisible(true);
        clear_customer.setVisible(true);
        editCustomer.setVisible(true);
        saveCustomer.setVisible(true);
        deleteOval.setVisible(true);
        
        //placeholders
        BusinessName1.setVisible(true);
        title1.setVisible(true);
        surname1.setVisible(true);
        othername1.setVisible(true);
        firstname1.setVisible(true);
        address1.setVisible(true);
        phonenumber1.setVisible(true);
        customer_email1.setVisible(true);
        pricecategory1.setVisible(true);
        creditlimit1.setVisible(true);
        openingBalance1.setVisible(true);
        ledgerName1.setVisible(true);
        regulate1.setVisible(true);
        
        //TextFields
        BusinessName_field1.setVisible(true);
        title_field1.setVisible(true);
        surname_field1.setVisible(true);
        others_field1.setVisible(true);
        firstname_field1.setVisible(true);
        address_field1.setVisible(true);
        phonenumber_field1.setVisible(true);
        email_field1.setVisible(true);
        pricecategory_field1.setVisible(true);
        creditLimit_field1.setVisible(true);
        openingBalance_field1.setVisible(true);
        ledgerName_field1.setVisible(true);
        regulate_field1.setVisible(true);
    }
    
    public void viewProduct(){
        RectangleModal1.setVisible(false);
        viewProductRectangle.setVisible(false);
        clear_product.setVisible(false);
        editProduct.setVisible(false);
        saveProduct.setVisible(false);
        deleteProduct.setVisible(false);
        
        //Placeholders
        product_type1.setVisible(false);
        paint_type1.setVisible(false);
        paint_code1.setVisible(false);
        litres1.setVisible(false);
        paint_color1.setVisible(false);
        selling_price1.setVisible(false);
        cost_price1.setVisible(false);
        master_code1.setVisible(false);
        producer1.setVisible(false);
        date1.setVisible(false);
        
        //TextFields
        productype_txtfield1.setVisible(false);
        paintType_field1.setVisible(false);
        paintCode_field1.setVisible(false);
        litres_field1.setVisible(false);
        paintColor_field1.setVisible(false);
        sellingPrice_field1.setVisible(false);
        costPrice_field1.setVisible(false);
        masterCode_field1.setVisible(false);
        producer_field1.setVisible(false);
        date_field1.setVisible(false);
    }
    
    public void visibleProduct(){
        RectangleModal1.setVisible(true);
        viewProductRectangle.setVisible(true);
        clear_product.setVisible(true);
        editProduct.setVisible(true);
        saveProduct.setVisible(true);
        deleteProduct.setVisible(true);
        
        //Placeholders
        product_type1.setVisible(true);
        paint_type1.setVisible(true);
        paint_code1.setVisible(true);
        litres1.setVisible(true);
        paint_color1.setVisible(true);
        selling_price1.setVisible(true);
        cost_price1.setVisible(true);
        master_code1.setVisible(true);
        producer1.setVisible(true);
        date1.setVisible(true);
        
        //TextFields
        productype_txtfield1.setVisible(true);
        paintType_field1.setVisible(true);
        paintCode_field1.setVisible(true);
        litres_field1.setVisible(true);
        paintColor_field1.setVisible(true);
        sellingPrice_field1.setVisible(true);
        costPrice_field1.setVisible(true);
        masterCode_field1.setVisible(true);
        producer_field1.setVisible(true);
        date_field1.setVisible(true);
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
        email = new javax.swing.JTextField();
        password_field = new javax.swing.JTextField();
        settings = new javax.swing.JLabel();
        gobtn = new javax.swing.JLabel();
        email_label = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        mock = new javax.swing.JLabel();
        logoName = new javax.swing.JLabel();
        clr = new javax.swing.JLabel();
        bcg = new javax.swing.JLabel();
        overview2 = new javax.swing.JPanel();
        IP = new javax.swing.JTextField();
        clear_overview = new javax.swing.JLabel();
        change = new javax.swing.JLabel();
        changeIP_field = new javax.swing.JLabel();
        changeIP = new javax.swing.JLabel();
        bcg10 = new javax.swing.JLabel();
        mock1 = new javax.swing.JLabel();
        clr9 = new javax.swing.JLabel();
        logoName1 = new javax.swing.JLabel();
        formPanel1 = new javax.swing.JPanel();
        signinform1 = new javax.swing.JPanel();
        email1 = new javax.swing.JTextField();
        password_field1 = new javax.swing.JTextField();
        settings1 = new javax.swing.JLabel();
        gobtn1 = new javax.swing.JLabel();
        email_label1 = new javax.swing.JLabel();
        password1 = new javax.swing.JLabel();
        bcg9 = new javax.swing.JLabel();
        overview3 = new javax.swing.JPanel();
        invalid = new javax.swing.JLabel();
        clear_overview3 = new javax.swing.JLabel();
        bcg11 = new javax.swing.JLabel();
        mock2 = new javax.swing.JLabel();
        clr10 = new javax.swing.JLabel();
        logoName2 = new javax.swing.JLabel();
        formPanel2 = new javax.swing.JPanel();
        signinform2 = new javax.swing.JPanel();
        email2 = new javax.swing.JTextField();
        password_field2 = new javax.swing.JTextField();
        settings2 = new javax.swing.JLabel();
        gobtn2 = new javax.swing.JLabel();
        email_label2 = new javax.swing.JLabel();
        password2 = new javax.swing.JLabel();
        bcg12 = new javax.swing.JLabel();
        login = new javax.swing.JPanel();
        Name = new javax.swing.JLabel();
        right = new javax.swing.JLabel();
        future_us = new javax.swing.JLabel();
        log_out = new javax.swing.JLabel();
        open_app = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        inventory = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        p1 = new javax.swing.JPanel();
        price = new javax.swing.JLabel();
        m_prdts = new javax.swing.JLabel();
        m_cuts = new javax.swing.JLabel();
        m_manAdm = new javax.swing.JLabel();
        m_invoice = new javax.swing.JLabel();
        other_products = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        clr1 = new javax.swing.JLabel();
        bcgWhite = new javax.swing.JLabel();
        bcg1 = new javax.swing.JLabel();
        mainmenuPrdt = new javax.swing.JPanel();
        logout = new javax.swing.JLabel();
        shopping_bag = new javax.swing.JLabel();
        product_txt = new javax.swing.JLabel();
        paint_customers = new javax.swing.JLabel();
        paint_products = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();
        Sidebar = new javax.swing.JLabel();
        product_label = new javax.swing.JLabel();
        clr6 = new javax.swing.JLabel();
        bcg6 = new javax.swing.JLabel();
        products = new javax.swing.JPanel();
        date_field = new javax.swing.JTextField();
        producer_field = new javax.swing.JTextField();
        masterCode_field = new javax.swing.JTextField();
        costPrice_field = new javax.swing.JTextField();
        sellingPrice_field = new javax.swing.JTextField();
        paintColor_field = new javax.swing.JTextField();
        litres_field = new javax.swing.JTextField();
        paintCode_field = new javax.swing.JTextField();
        paintType_field = new javax.swing.JTextField();
        productype_txtfield = new javax.swing.JTextField();
        btn_logout = new javax.swing.JLabel();
        coins_img = new javax.swing.JLabel();
        coins = new javax.swing.JLabel();
        image_img = new javax.swing.JLabel();
        image = new javax.swing.JLabel();
        folder_img = new javax.swing.JLabel();
        folder = new javax.swing.JLabel();
        database_img = new javax.swing.JLabel();
        database = new javax.swing.JLabel();
        paint_bucket_img = new javax.swing.JLabel();
        paint_bucket = new javax.swing.JLabel();
        View = new javax.swing.JLabel();
        Add = new javax.swing.JLabel();
        add_productBtn = new javax.swing.JLabel();
        date_txt = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        producer_text = new javax.swing.JLabel();
        producer = new javax.swing.JLabel();
        master_code_txt = new javax.swing.JLabel();
        master_code = new javax.swing.JLabel();
        cost_price_txt = new javax.swing.JLabel();
        cost_price = new javax.swing.JLabel();
        selling_price_txt = new javax.swing.JLabel();
        selling_price = new javax.swing.JLabel();
        paint_color_txt = new javax.swing.JLabel();
        paint_color = new javax.swing.JLabel();
        litres_txt = new javax.swing.JLabel();
        litres = new javax.swing.JLabel();
        paint_code_txt = new javax.swing.JLabel();
        paint_code = new javax.swing.JLabel();
        paint_type_txt = new javax.swing.JLabel();
        paint_type = new javax.swing.JLabel();
        back_btn = new javax.swing.JLabel();
        down = new javax.swing.JLabel();
        up = new javax.swing.JLabel();
        p_type_txt = new javax.swing.JLabel();
        product_type = new javax.swing.JLabel();
        add_products = new javax.swing.JLabel();
        clr2 = new javax.swing.JLabel();
        bcgWhite1 = new javax.swing.JLabel();
        bcg3 = new javax.swing.JLabel();
        viewproducts = new javax.swing.JPanel();
        deleteProduct = new javax.swing.JLabel();
        saveProduct = new javax.swing.JLabel();
        editProduct = new javax.swing.JLabel();
        clear_product = new javax.swing.JLabel();
        productype_txtfield1 = new javax.swing.JTextField();
        product_type1 = new javax.swing.JLabel();
        paintType_field1 = new javax.swing.JTextField();
        paint_type1 = new javax.swing.JLabel();
        paintCode_field1 = new javax.swing.JTextField();
        paint_code1 = new javax.swing.JLabel();
        litres_field1 = new javax.swing.JTextField();
        litres1 = new javax.swing.JLabel();
        paintColor_field1 = new javax.swing.JTextField();
        paint_color1 = new javax.swing.JLabel();
        producer_field1 = new javax.swing.JTextField();
        producer1 = new javax.swing.JLabel();
        masterCode_field1 = new javax.swing.JTextField();
        master_code1 = new javax.swing.JLabel();
        costPrice_field1 = new javax.swing.JTextField();
        cost_price1 = new javax.swing.JLabel();
        sellingPrice_field1 = new javax.swing.JTextField();
        selling_price1 = new javax.swing.JLabel();
        date_field1 = new javax.swing.JTextField();
        date1 = new javax.swing.JLabel();
        viewProductRectangle = new javax.swing.JLabel();
        RectangleModal1 = new javax.swing.JLabel();
        delete_product = new javax.swing.JLabel();
        Rectangleview = new javax.swing.JLabel();
        viewRectangle = new javax.swing.JLabel();
        viewback_btn = new javax.swing.JLabel();
        clr7 = new javax.swing.JLabel();
        btn_logoutview = new javax.swing.JLabel();
        nothing = new javax.swing.JLabel();
        view_viewproduct = new javax.swing.JLabel();
        Add_viewproducts = new javax.swing.JLabel();
        coins_img1 = new javax.swing.JLabel();
        coins1 = new javax.swing.JLabel();
        image_img1 = new javax.swing.JLabel();
        image1 = new javax.swing.JLabel();
        folder_img1 = new javax.swing.JLabel();
        folder1 = new javax.swing.JLabel();
        database_img1 = new javax.swing.JLabel();
        database1 = new javax.swing.JLabel();
        paint_bucket_img2 = new javax.swing.JLabel();
        paint_bucket2 = new javax.swing.JLabel();
        bcgWhite5 = new javax.swing.JLabel();
        bcg7 = new javax.swing.JLabel();
        customers = new javax.swing.JPanel();
        email_field = new javax.swing.JTextField();
        title_field = new javax.swing.JTextField();
        surname_field = new javax.swing.JTextField();
        others_field = new javax.swing.JTextField();
        firstname_field = new javax.swing.JTextField();
        address_field = new javax.swing.JTextField();
        phonenumber_field = new javax.swing.JTextField();
        pricecategory_field = new javax.swing.JTextField();
        creditLimit_field = new javax.swing.JTextField();
        openingBalance_field = new javax.swing.JTextField();
        ledgerName_field = new javax.swing.JTextField();
        regulate_field = new javax.swing.JTextField();
        BusinessName_field = new javax.swing.JTextField();
        regulate = new javax.swing.JLabel();
        addcustomer = new javax.swing.JLabel();
        pricecategory = new javax.swing.JLabel();
        creditlimit = new javax.swing.JLabel();
        openingBalance = new javax.swing.JLabel();
        ledgerName = new javax.swing.JLabel();
        phonenumber = new javax.swing.JLabel();
        customer_email = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        firstname = new javax.swing.JLabel();
        othername = new javax.swing.JLabel();
        surname = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        BusinessName = new javax.swing.JLabel();
        customer_label = new javax.swing.JLabel();
        clear = new javax.swing.JLabel();
        customerback_btn = new javax.swing.JLabel();
        customers_btn_logout = new javax.swing.JLabel();
        Add_customers = new javax.swing.JLabel();
        View_customers = new javax.swing.JLabel();
        coins_img2 = new javax.swing.JLabel();
        coins2 = new javax.swing.JLabel();
        image_img2 = new javax.swing.JLabel();
        image2 = new javax.swing.JLabel();
        folder_img2 = new javax.swing.JLabel();
        folder2 = new javax.swing.JLabel();
        database_img2 = new javax.swing.JLabel();
        database2 = new javax.swing.JLabel();
        paint_bucket_img3 = new javax.swing.JLabel();
        paint_bucket3 = new javax.swing.JLabel();
        bcgWhite2 = new javax.swing.JLabel();
        clr4 = new javax.swing.JLabel();
        bcg4 = new javax.swing.JLabel();
        viewCustomers = new javax.swing.JPanel();
        clear_customer = new javax.swing.JLabel();
        deleteOval = new javax.swing.JLabel();
        saveCustomer = new javax.swing.JLabel();
        editCustomer = new javax.swing.JLabel();
        BusinessName_field1 = new javax.swing.JTextField();
        BusinessName1 = new javax.swing.JLabel();
        title_field1 = new javax.swing.JTextField();
        title1 = new javax.swing.JLabel();
        surname_field1 = new javax.swing.JTextField();
        surname1 = new javax.swing.JLabel();
        others_field1 = new javax.swing.JTextField();
        othername1 = new javax.swing.JLabel();
        firstname_field1 = new javax.swing.JTextField();
        firstname1 = new javax.swing.JLabel();
        address_field1 = new javax.swing.JTextField();
        address1 = new javax.swing.JLabel();
        phonenumber_field1 = new javax.swing.JTextField();
        phonenumber1 = new javax.swing.JLabel();
        email_field1 = new javax.swing.JTextField();
        customer_email1 = new javax.swing.JLabel();
        ledgerName_field1 = new javax.swing.JTextField();
        ledgerName1 = new javax.swing.JLabel();
        openingBalance_field1 = new javax.swing.JTextField();
        openingBalance1 = new javax.swing.JLabel();
        creditLimit_field1 = new javax.swing.JTextField();
        creditlimit1 = new javax.swing.JLabel();
        pricecategory_field1 = new javax.swing.JTextField();
        pricecategory1 = new javax.swing.JLabel();
        regulate_field1 = new javax.swing.JTextField();
        regulate1 = new javax.swing.JLabel();
        customerRectangle1 = new javax.swing.JLabel();
        RectangleModal = new javax.swing.JLabel();
        clr8 = new javax.swing.JLabel();
        btn_logoutcustomer = new javax.swing.JLabel();
        customerRectangle = new javax.swing.JLabel();
        search_customer = new javax.swing.JLabel();
        delete_customer = new javax.swing.JLabel();
        Add_viewcustomers = new javax.swing.JLabel();
        view_viewcustomers = new javax.swing.JLabel();
        paint_bucket_img4 = new javax.swing.JLabel();
        paint_bucket4 = new javax.swing.JLabel();
        database_img3 = new javax.swing.JLabel();
        database3 = new javax.swing.JLabel();
        folder_img3 = new javax.swing.JLabel();
        folder3 = new javax.swing.JLabel();
        image_img3 = new javax.swing.JLabel();
        image3 = new javax.swing.JLabel();
        coins_img3 = new javax.swing.JLabel();
        coins3 = new javax.swing.JLabel();
        bcgWhite6 = new javax.swing.JLabel();
        bcg8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setLayout(new java.awt.CardLayout());

        overview.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        formPanel.setOpaque(false);
        formPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signinform.setOpaque(false);
        signinform.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        email.setFont(new java.awt.Font("Futura Md BT", 0, 18)); // NOI18N
        email.setForeground(new java.awt.Color(94, 93, 93));
        email.setBorder(null);
        signinform.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 360, 60));

        password_field.setFont(new java.awt.Font("Futura Md BT", 0, 18)); // NOI18N
        password_field.setForeground(new java.awt.Color(94, 93, 93));
        password_field.setBorder(null);
        signinform.add(password_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 360, 60));

        settings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/left.png"))); // NOI18N
        settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsMouseClicked(evt);
            }
        });
        signinform.add(settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        gobtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gobtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/right.png"))); // NOI18N
        gobtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gobtnMouseClicked(evt);
            }
        });
        signinform.add(gobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, -1, -1));

        email_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/email_2.png"))); // NOI18N
        signinform.add(email_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 10, 520, 190));

        password.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/password.png"))); // NOI18N
        signinform.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 180, 510, 190));

        formPanel.add(signinform, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 490, 460));

        overview.add(formPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 490, 560));

        mock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/mcokup-2.png"))); // NOI18N
        overview.add(mock, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 200, -1, -1));

        logoName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Inventory Management.png"))); // NOI18N
        overview.add(logoName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 470, 60));

        clr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/2018 ©ysr company li.png"))); // NOI18N
        overview.add(clr, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 680, -1, -1));

        bcg.setForeground(new java.awt.Color(94, 93, 93));
        bcg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Group.png"))); // NOI18N
        overview.add(bcg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mainPanel.add(overview, "card3");

        overview2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IP.setFont(new java.awt.Font("Futura Md BT", 0, 15)); // NOI18N
        IP.setForeground(new java.awt.Color(94, 93, 93));
        IP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        IP.setBorder(null);
        overview2.add(IP, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 230, 40));

        clear_overview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Clear.png"))); // NOI18N
        clear_overview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clear_overviewMouseClicked(evt);
            }
        });
        overview2.add(clear_overview, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 40, 60, 60));

        change.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/change.png"))); // NOI18N
        overview2.add(change, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 127, 54));

        changeIP_field.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/changeIP_field.png"))); // NOI18N
        overview2.add(changeIP_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 460, 140));

        changeIP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Change IP Address.png"))); // NOI18N
        overview2.add(changeIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 217, 54));

        bcg10.setForeground(new java.awt.Color(94, 93, 93));
        bcg10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/overviewModal.png"))); // NOI18N
        overview2.add(bcg10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mock1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mock1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/mcokup-2.png"))); // NOI18N
        overview2.add(mock1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 200, -1, -1));

        clr9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clr9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/2018 ©ysr company li.png"))); // NOI18N
        overview2.add(clr9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 680, -1, -1));

        logoName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoName1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Inventory Management.png"))); // NOI18N
        overview2.add(logoName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 470, 60));

        formPanel1.setOpaque(false);
        formPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signinform1.setOpaque(false);
        signinform1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        email1.setEditable(false);
        email1.setFont(new java.awt.Font("Futura Md BT", 0, 18)); // NOI18N
        email1.setForeground(new java.awt.Color(94, 93, 93));
        email1.setBorder(null);
        signinform1.add(email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 360, 60));

        password_field1.setEditable(false);
        password_field1.setFont(new java.awt.Font("Futura Md BT", 0, 18)); // NOI18N
        password_field1.setForeground(new java.awt.Color(94, 93, 93));
        password_field1.setBorder(null);
        signinform1.add(password_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 360, 60));

        settings1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        settings1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/left.png"))); // NOI18N
        signinform1.add(settings1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        gobtn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gobtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/right.png"))); // NOI18N
        gobtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gobtn1MouseClicked(evt);
            }
        });
        signinform1.add(gobtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, -1, -1));

        email_label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/email_2.png"))); // NOI18N
        signinform1.add(email_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 10, 520, 190));

        password1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/password.png"))); // NOI18N
        signinform1.add(password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 180, 510, 190));

        formPanel1.add(signinform1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 490, 460));

        overview2.add(formPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 490, 560));

        bcg9.setForeground(new java.awt.Color(94, 93, 93));
        bcg9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Group.png"))); // NOI18N
        overview2.add(bcg9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mainPanel.add(overview2, "card12");

        overview3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        invalid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Invalid Email and Password.png"))); // NOI18N
        overview3.add(invalid, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 310, 34));

        clear_overview3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Clear.png"))); // NOI18N
        clear_overview3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clear_overview3MouseClicked(evt);
            }
        });
        overview3.add(clear_overview3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 40, 60, 60));

        bcg11.setForeground(new java.awt.Color(94, 93, 93));
        bcg11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/overviewModal.png"))); // NOI18N
        overview3.add(bcg11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mock2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mock2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/mcokup-2.png"))); // NOI18N
        overview3.add(mock2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 200, -1, -1));

        clr10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clr10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/2018 ©ysr company li.png"))); // NOI18N
        overview3.add(clr10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 680, -1, -1));

        logoName2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoName2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Inventory Management.png"))); // NOI18N
        overview3.add(logoName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 470, 60));

        formPanel2.setOpaque(false);
        formPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signinform2.setOpaque(false);
        signinform2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        email2.setEditable(false);
        email2.setFont(new java.awt.Font("Futura Md BT", 0, 18)); // NOI18N
        email2.setForeground(new java.awt.Color(94, 93, 93));
        email2.setBorder(null);
        signinform2.add(email2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 360, 60));

        password_field2.setEditable(false);
        password_field2.setFont(new java.awt.Font("Futura Md BT", 0, 18)); // NOI18N
        password_field2.setForeground(new java.awt.Color(94, 93, 93));
        password_field2.setBorder(null);
        signinform2.add(password_field2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 360, 60));

        settings2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        settings2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/left.png"))); // NOI18N
        signinform2.add(settings2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        gobtn2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gobtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/right.png"))); // NOI18N
        gobtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gobtn2MouseClicked(evt);
            }
        });
        signinform2.add(gobtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, -1, -1));

        email_label2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/email_2.png"))); // NOI18N
        signinform2.add(email_label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 10, 520, 190));

        password2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/password.png"))); // NOI18N
        signinform2.add(password2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 180, 510, 190));

        formPanel2.add(signinform2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 490, 460));

        overview3.add(formPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 490, 560));

        bcg12.setForeground(new java.awt.Color(94, 93, 93));
        bcg12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Group.png"))); // NOI18N
        overview3.add(bcg12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mainPanel.add(overview3, "card13");

        login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Name.setBackground(new java.awt.Color(255, 255, 255));
        Name.setFont(new java.awt.Font("Futura Md BT", 0, 30)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 255, 255));
        Name.setText("Mr. John Adewale");
        login.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 430, 40));

        right.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/settings.png"))); // NOI18N
        login.add(right, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 370, 50, 50));

        future_us.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/2018 ©ysr company li.png"))); // NOI18N
        login.add(future_us, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 700, 343, 22));

        log_out.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/logout.png"))); // NOI18N
        log_out.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                log_outMouseClicked(evt);
            }
        });
        login.add(log_out, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 370, 127, 54));

        open_app.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/open_app.png"))); // NOI18N
        open_app.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                open_appMouseClicked(evt);
            }
        });
        login.add(open_app, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 127, 54));

        user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/user.png"))); // NOI18N
        login.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 196, 196));

        inventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Inventory Management.png"))); // NOI18N
        login.add(inventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 19, 424, 54));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Group.png"))); // NOI18N
        login.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mainPanel.add(login, "card9");

        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p1.setOpaque(false);
        p1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        price.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/coins.png"))); // NOI18N
        p1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 118, 118));

        m_prdts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        m_prdts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/products.png"))); // NOI18N
        m_prdts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_prdtsMouseClicked(evt);
            }
        });
        p1.add(m_prdts, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        m_cuts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        m_cuts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/customers_menu.png"))); // NOI18N
        m_cuts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_cutsMouseClicked(evt);
            }
        });
        p1.add(m_cuts, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, -1));

        m_manAdm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        m_manAdm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/manageAdmins.png"))); // NOI18N
        p1.add(m_manAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 60, -1, -1));

        m_invoice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        m_invoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/invoice.png"))); // NOI18N
        p1.add(m_invoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));

        other_products.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        other_products.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/price.png"))); // NOI18N
        p1.add(other_products, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, -1, -1));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Back.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        p1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 550, 110, 110));

        menu.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 1160, 620));

        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/logout.png"))); // NOI18N
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });
        menu.add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 700, 127, 54));

        clr1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clr1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/2018 ©ysr company li.png"))); // NOI18N
        menu.add(clr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 710, -1, -1));

        bcgWhite.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgWhite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Rectangle.png"))); // NOI18N
        menu.add(bcgWhite, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, -1, -1));

        bcg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Group.png"))); // NOI18N
        menu.add(bcg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mainPanel.add(menu, "card5");

        mainmenuPrdt.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/logout.png"))); // NOI18N
        mainmenuPrdt.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 670, 127, 54));

        shopping_bag.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shopping_bag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/shopping-bag.png"))); // NOI18N
        mainmenuPrdt.add(shopping_bag, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 270, 117, 117));

        product_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Products_text.png"))); // NOI18N
        mainmenuPrdt.add(product_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 103, 36));

        paint_customers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paint_customers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/customers2.png"))); // NOI18N
        mainmenuPrdt.add(paint_customers, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 220, 237, 232));

        paint_products.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paint_products.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/products.png"))); // NOI18N
        paint_products.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paint_productsMouseClicked(evt);
            }
        });
        mainmenuPrdt.add(paint_products, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 237, 232));

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Back.png"))); // NOI18N
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });
        mainmenuPrdt.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 560, 130, 150));

        Sidebar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Sidebar.png"))); // NOI18N
        mainmenuPrdt.add(Sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 55, 54));

        product_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        product_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Rectangle.png"))); // NOI18N
        mainmenuPrdt.add(product_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1250, 700));

        clr6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clr6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/2018 ©ysr company li.png"))); // NOI18N
        mainmenuPrdt.add(clr6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 690, -1, -1));

        bcg6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Group.png"))); // NOI18N
        mainmenuPrdt.add(bcg6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mainPanel.add(mainmenuPrdt, "card4");

        products.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        date_field.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        date_field.setForeground(new java.awt.Color(67, 72, 77));
        date_field.setBorder(null);
        products.add(date_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 230, 30));

        producer_field.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        producer_field.setForeground(new java.awt.Color(67, 72, 77));
        producer_field.setBorder(null);
        products.add(producer_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 340, 210, 30));

        masterCode_field.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        masterCode_field.setForeground(new java.awt.Color(67, 72, 77));
        masterCode_field.setBorder(null);
        products.add(masterCode_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 340, 120, 30));

        costPrice_field.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        costPrice_field.setForeground(new java.awt.Color(67, 72, 77));
        costPrice_field.setBorder(null);
        products.add(costPrice_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 180, 30));

        sellingPrice_field.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        sellingPrice_field.setForeground(new java.awt.Color(67, 72, 77));
        sellingPrice_field.setBorder(null);
        products.add(sellingPrice_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 180, 30));

        paintColor_field.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        paintColor_field.setForeground(new java.awt.Color(67, 72, 77));
        paintColor_field.setBorder(null);
        products.add(paintColor_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 230, 180, 30));

        litres_field.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        litres_field.setForeground(new java.awt.Color(67, 72, 77));
        litres_field.setBorder(null);
        products.add(litres_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 230, 80, 30));

        paintCode_field.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        paintCode_field.setForeground(new java.awt.Color(67, 72, 77));
        paintCode_field.setBorder(null);
        products.add(paintCode_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 120, 30));

        paintType_field.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        paintType_field.setForeground(new java.awt.Color(67, 72, 77));
        paintType_field.setBorder(null);
        products.add(paintType_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 120, 30));

        productype_txtfield.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        productype_txtfield.setForeground(new java.awt.Color(67, 72, 77));
        productype_txtfield.setBorder(null);
        products.add(productype_txtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 120, 30));

        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/logout.png"))); // NOI18N
        btn_logout.setText("jLabel1");
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logoutMouseClicked(evt);
            }
        });
        products.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 700, 127, 54));

        coins_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coins_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/coins_little.png"))); // NOI18N
        products.add(coins_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 375, 26, 26));

        coins.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coins.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Oval_rectangle.png"))); // NOI18N
        products.add(coins, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 55, 54));

        image_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/image.png"))); // NOI18N
        products.add(image_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 305, 30, 30));

        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Oval_rectangle.png"))); // NOI18N
        products.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 55, 54));

        folder_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        folder_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/folder.png"))); // NOI18N
        products.add(folder_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 235, 33, 28));

        folder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        folder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Oval_rectangle.png"))); // NOI18N
        products.add(folder, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 55, 54));

        database_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        database_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/database.png"))); // NOI18N
        products.add(database_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 165, 28, 28));

        database.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        database.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Oval_rectangle.png"))); // NOI18N
        products.add(database, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 55, 54));

        paint_bucket_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paint_bucket_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/paint-bucket.png"))); // NOI18N
        products.add(paint_bucket_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 95, 19, 27));

        paint_bucket.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paint_bucket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Oval_rectangle.png"))); // NOI18N
        products.add(paint_bucket, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 55, 54));

        View.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/viewbtn.png"))); // NOI18N
        View.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewMouseClicked(evt);
            }
        });
        products.add(View, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 124, 54));

        Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/addbtnStroke.png"))); // NOI18N
        products.add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 105, 55));

        add_productBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/btnProduct.png"))); // NOI18N
        products.add(add_productBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 320, 150));

        date_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Date_txt.png"))); // NOI18N
        products.add(date_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 70, 16));

        date.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/date.png"))); // NOI18N
        products.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 320, 150));

        producer_text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Producer_txt.png"))); // NOI18N
        products.add(producer_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 320, 70, 16));

        producer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/producer.png"))); // NOI18N
        products.add(producer, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 300, 310, 140));

        master_code_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Master Code.png"))); // NOI18N
        products.add(master_code_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 320, 80, 16));

        master_code.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/master_code.png"))); // NOI18N
        products.add(master_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 220, 140));

        cost_price_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/costPrice.png"))); // NOI18N
        products.add(cost_price_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 80, 16));

        cost_price.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Paint_color.png"))); // NOI18N
        products.add(cost_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 270, 140));

        selling_price_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Selling Price.png"))); // NOI18N
        products.add(selling_price_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 80, 16));

        selling_price.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Paint_color.png"))); // NOI18N
        products.add(selling_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 270, 140));

        paint_color_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Paint Color.png"))); // NOI18N
        products.add(paint_color_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 210, 80, 16));

        paint_color.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Paint_color.png"))); // NOI18N
        products.add(paint_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 190, 270, 140));

        litres_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Litres_txt.png"))); // NOI18N
        products.add(litres_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 210, 40, 16));

        litres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/litres.png"))); // NOI18N
        products.add(litres, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 190, 200, 140));

        paint_code_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Paint Code.png"))); // NOI18N
        products.add(paint_code_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, 80, 16));

        paint_code.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/product_type.png"))); // NOI18N
        products.add(paint_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 250, 140));

        paint_type_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Paint Type.png"))); // NOI18N
        products.add(paint_type_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 80, 16));

        paint_type.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/product_type.png"))); // NOI18N
        products.add(paint_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 250, 140));

        back_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Back.png"))); // NOI18N
        back_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_btnMouseClicked(evt);
            }
        });
        products.add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 70, 120, 110));

        down.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Chevron Down_12px.png"))); // NOI18N
        down.setText("jLabel1");
        products.add(down, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 15, 19));

        up.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Chevron Up_12px.png"))); // NOI18N
        up.setText("jLabel1");
        products.add(up, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 15, 19));

        p_type_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Product Type_txt.png"))); // NOI18N
        products.add(p_type_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 80, 16));

        product_type.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/product_type.png"))); // NOI18N
        products.add(product_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 250, 140));

        add_products.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Rectangle_AddProducts.png"))); // NOI18N
        products.add(add_products, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 1022, 492));

        clr2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clr2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/2018 ©ysr company li.png"))); // NOI18N
        products.add(clr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 710, -1, -1));

        bcgWhite1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgWhite1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Rectangle.png"))); // NOI18N
        products.add(bcgWhite1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        bcg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Group.png"))); // NOI18N
        products.add(bcg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mainPanel.add(products, "card4");

        viewproducts.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        deleteProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/deleteOval.png"))); // NOI18N
        viewproducts.add(deleteProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 530, 127, 54));

        saveProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/saveproduct.png"))); // NOI18N
        viewproducts.add(saveProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 520, 300, 140));

        editProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/editProduct.png"))); // NOI18N
        viewproducts.add(editProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, 300, 140));

        clear_product.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Clear.png"))); // NOI18N
        clear_product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clear_productMouseClicked(evt);
            }
        });
        viewproducts.add(clear_product, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 130, 60, 60));

        productype_txtfield1.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        productype_txtfield1.setForeground(new java.awt.Color(67, 72, 77));
        productype_txtfield1.setBorder(null);
        viewproducts.add(productype_txtfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 120, 30));

        product_type1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Product type.png"))); // NOI18N
        viewproducts.add(product_type1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 250, 140));

        paintType_field1.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        paintType_field1.setForeground(new java.awt.Color(67, 72, 77));
        paintType_field1.setBorder(null);
        viewproducts.add(paintType_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 120, 30));

        paint_type1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/paintType.png"))); // NOI18N
        viewproducts.add(paint_type1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 250, 140));

        paintCode_field1.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        paintCode_field1.setForeground(new java.awt.Color(67, 72, 77));
        paintCode_field1.setBorder(null);
        viewproducts.add(paintCode_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, 120, 30));

        paint_code1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/paCo.png"))); // NOI18N
        viewproducts.add(paint_code1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 250, 140));

        litres_field1.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        litres_field1.setForeground(new java.awt.Color(67, 72, 77));
        litres_field1.setBorder(null);
        viewproducts.add(litres_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 230, 80, 30));

        litres1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/litres_label.png"))); // NOI18N
        viewproducts.add(litres1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 190, 200, 140));

        paintColor_field1.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        paintColor_field1.setForeground(new java.awt.Color(67, 72, 77));
        paintColor_field1.setBorder(null);
        viewproducts.add(paintColor_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 180, 30));

        paint_color1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/paCol.png"))); // NOI18N
        viewproducts.add(paint_color1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 270, 140));

        producer_field1.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        producer_field1.setForeground(new java.awt.Color(67, 72, 77));
        producer_field1.setBorder(null);
        viewproducts.add(producer_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, 210, 30));

        producer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Producer_label.png"))); // NOI18N
        viewproducts.add(producer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 310, 140));

        masterCode_field1.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        masterCode_field1.setForeground(new java.awt.Color(67, 72, 77));
        masterCode_field1.setBorder(null);
        viewproducts.add(masterCode_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 120, 30));

        master_code1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/masterCode.png"))); // NOI18N
        viewproducts.add(master_code1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 220, 140));

        costPrice_field1.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        costPrice_field1.setForeground(new java.awt.Color(67, 72, 77));
        costPrice_field1.setBorder(null);
        viewproducts.add(costPrice_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 350, 170, 30));

        cost_price1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/costPrice_label.png"))); // NOI18N
        viewproducts.add(cost_price1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 310, 270, 140));

        sellingPrice_field1.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        sellingPrice_field1.setForeground(new java.awt.Color(67, 72, 77));
        sellingPrice_field1.setBorder(null);
        viewproducts.add(sellingPrice_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 160, 30));

        selling_price1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/sellingPrice.png"))); // NOI18N
        viewproducts.add(selling_price1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 270, 140));

        date_field1.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        date_field1.setForeground(new java.awt.Color(67, 72, 77));
        date_field1.setBorder(null);
        viewproducts.add(date_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 440, 230, 30));

        date1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/date_label.png"))); // NOI18N
        viewproducts.add(date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 400, 320, 150));

        viewProductRectangle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/customerView.png"))); // NOI18N
        viewproducts.add(viewProductRectangle, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 1016, 531));

        RectangleModal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Rectangle Modal.png"))); // NOI18N
        viewproducts.add(RectangleModal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 53, 1183, 639));

        delete_product.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/delete.png"))); // NOI18N
        delete_product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_productMouseClicked(evt);
            }
        });
        viewproducts.add(delete_product, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 127, 54));

        Rectangleview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Rectangle_view.png"))); // NOI18N
        viewproducts.add(Rectangleview, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 1022, 32));

        viewRectangle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/viewRectangle.png"))); // NOI18N
        viewproducts.add(viewRectangle, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 1022, 492));

        viewback_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Back.png"))); // NOI18N
        viewback_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewback_btnMouseClicked(evt);
            }
        });
        viewproducts.add(viewback_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 70, 120, 110));

        clr7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clr7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/2018 ©ysr company li.png"))); // NOI18N
        viewproducts.add(clr7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 710, -1, -1));

        btn_logoutview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/logout.png"))); // NOI18N
        btn_logoutview.setText("jLabel1");
        btn_logoutview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logoutviewMouseClicked(evt);
            }
        });
        viewproducts.add(btn_logoutview, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 700, 127, 54));

        nothing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/viewSubMenu.png"))); // NOI18N
        viewproducts.add(nothing, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 257, 54));

        view_viewproduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/viewStroke.png"))); // NOI18N
        viewproducts.add(view_viewproduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 130, -1));

        Add_viewproducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/addOpaque.png"))); // NOI18N
        Add_viewproducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Add_viewproductsMouseClicked(evt);
            }
        });
        viewproducts.add(Add_viewproducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 105, 55));

        coins_img1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coins_img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/coins_little.png"))); // NOI18N
        viewproducts.add(coins_img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 375, 26, 26));

        coins1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coins1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Oval_rectangle.png"))); // NOI18N
        viewproducts.add(coins1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 55, 54));

        image_img1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image_img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/image.png"))); // NOI18N
        viewproducts.add(image_img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 305, 30, 30));

        image1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Oval_rectangle.png"))); // NOI18N
        viewproducts.add(image1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 55, 54));

        folder_img1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        folder_img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/folder.png"))); // NOI18N
        viewproducts.add(folder_img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 235, 33, 28));

        folder1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        folder1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Oval_rectangle.png"))); // NOI18N
        viewproducts.add(folder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 55, 54));

        database_img1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        database_img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/database.png"))); // NOI18N
        viewproducts.add(database_img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 165, 28, 28));

        database1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        database1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Oval_rectangle.png"))); // NOI18N
        viewproducts.add(database1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 55, 54));

        paint_bucket_img2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paint_bucket_img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/paint-bucket.png"))); // NOI18N
        viewproducts.add(paint_bucket_img2, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 95, 19, 27));

        paint_bucket2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paint_bucket2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Oval_rectangle.png"))); // NOI18N
        viewproducts.add(paint_bucket2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 55, 54));

        bcgWhite5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgWhite5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Rectangle.png"))); // NOI18N
        viewproducts.add(bcgWhite5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        bcg7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Group.png"))); // NOI18N
        viewproducts.add(bcg7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mainPanel.add(viewproducts, "card10");

        customers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        email_field.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        email_field.setForeground(new java.awt.Color(67, 72, 77));
        email_field.setBorder(null);
        customers.add(email_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 340, 210, 30));

        title_field.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        title_field.setForeground(new java.awt.Color(67, 72, 77));
        title_field.setBorder(null);
        customers.add(title_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 130, 30));

        surname_field.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        surname_field.setForeground(new java.awt.Color(67, 72, 77));
        surname_field.setBorder(null);
        customers.add(surname_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 130, 30));

        others_field.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        others_field.setForeground(new java.awt.Color(67, 72, 77));
        others_field.setBorder(null);
        customers.add(others_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 230, 180, 30));

        firstname_field.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        firstname_field.setForeground(new java.awt.Color(67, 72, 77));
        firstname_field.setBorder(null);
        customers.add(firstname_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 230, 130, 30));

        address_field.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        address_field.setForeground(new java.awt.Color(67, 72, 77));
        address_field.setBorder(null);
        customers.add(address_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 380, 30));

        phonenumber_field.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        phonenumber_field.setForeground(new java.awt.Color(67, 72, 77));
        phonenumber_field.setBorder(null);
        customers.add(phonenumber_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, 180, 30));

        pricecategory_field.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        pricecategory_field.setForeground(new java.awt.Color(67, 72, 77));
        pricecategory_field.setBorder(null);
        customers.add(pricecategory_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 230, 30));

        creditLimit_field.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        creditLimit_field.setForeground(new java.awt.Color(67, 72, 77));
        creditLimit_field.setBorder(null);
        customers.add(creditLimit_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, 190, 30));

        openingBalance_field.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        openingBalance_field.setForeground(new java.awt.Color(67, 72, 77));
        openingBalance_field.setBorder(null);
        customers.add(openingBalance_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 450, 180, 30));

        ledgerName_field.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        ledgerName_field.setForeground(new java.awt.Color(67, 72, 77));
        ledgerName_field.setBorder(null);
        customers.add(ledgerName_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 450, 140, 30));

        regulate_field.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        regulate_field.setForeground(new java.awt.Color(67, 72, 77));
        regulate_field.setBorder(null);
        customers.add(regulate_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, 180, 30));

        BusinessName_field.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        BusinessName_field.setForeground(new java.awt.Color(67, 72, 77));
        BusinessName_field.setBorder(null);
        customers.add(BusinessName_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 130, 30));

        regulate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/regulate.png"))); // NOI18N
        customers.add(regulate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 510, 260, 140));

        addcustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/saveCustomer.png"))); // NOI18N
        customers.add(addcustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, 300, 140));

        pricecategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/price-category.png"))); // NOI18N
        customers.add(pricecategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 310, 140));

        creditlimit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/creditLimit.png"))); // NOI18N
        customers.add(creditlimit, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 260, 140));

        openingBalance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/opening Balance.png"))); // NOI18N
        customers.add(openingBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 260, 140));

        ledgerName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/LedgerName.png"))); // NOI18N
        customers.add(ledgerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 410, 210, 140));

        phonenumber.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/phoneNumber.png"))); // NOI18N
        customers.add(phonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 260, 140));

        customer_email.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/email.png"))); // NOI18N
        customers.add(customer_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 300, 280, 140));

        address.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/address.png"))); // NOI18N
        customers.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 470, 140));

        firstname.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Firstname.png"))); // NOI18N
        customers.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 190, 210, 140));

        othername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Othernames.png"))); // NOI18N
        customers.add(othername, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 190, 260, 140));

        surname.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Surname.png"))); // NOI18N
        customers.add(surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 210, 140));

        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Title.png"))); // NOI18N
        customers.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 210, 140));

        BusinessName.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        BusinessName.setForeground(new java.awt.Color(67, 72, 77));
        BusinessName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/BusinessName.png"))); // NOI18N
        customers.add(BusinessName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 210, 140));

        customer_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Rectangle_AddProducts.png"))); // NOI18N
        customers.add(customer_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 1022, 492));

        clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Clear.png"))); // NOI18N
        customers.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 70, 60, 60));

        customerback_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Back.png"))); // NOI18N
        customerback_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerback_btnMouseClicked(evt);
            }
        });
        customers.add(customerback_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 70, 120, 110));

        customers_btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/logout.png"))); // NOI18N
        customers_btn_logout.setText("jLabel1");
        customers_btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customers_btn_logoutMouseClicked(evt);
            }
        });
        customers.add(customers_btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 700, 127, 54));

        Add_customers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/addbtnStroke.png"))); // NOI18N
        customers.add(Add_customers, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 105, 55));

        View_customers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/viewbtn.png"))); // NOI18N
        View_customers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                View_customersMouseClicked(evt);
            }
        });
        customers.add(View_customers, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 124, 54));

        coins_img2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coins_img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/coins_little.png"))); // NOI18N
        customers.add(coins_img2, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 375, 26, 26));

        coins2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coins2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Oval_rectangle.png"))); // NOI18N
        customers.add(coins2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 55, 54));

        image_img2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image_img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/image.png"))); // NOI18N
        customers.add(image_img2, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 305, 30, 30));

        image2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Oval_rectangle.png"))); // NOI18N
        customers.add(image2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 55, 54));

        folder_img2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        folder_img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/folder.png"))); // NOI18N
        customers.add(folder_img2, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 235, 33, 28));

        folder2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        folder2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Oval_rectangle.png"))); // NOI18N
        customers.add(folder2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 55, 54));

        database_img2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        database_img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/database.png"))); // NOI18N
        customers.add(database_img2, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 165, 28, 28));

        database2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        database2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Oval_rectangle.png"))); // NOI18N
        customers.add(database2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 55, 54));

        paint_bucket_img3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paint_bucket_img3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/paint-bucket.png"))); // NOI18N
        customers.add(paint_bucket_img3, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 95, 19, 27));

        paint_bucket3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paint_bucket3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Oval_rectangle.png"))); // NOI18N
        customers.add(paint_bucket3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 55, 54));

        bcgWhite2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgWhite2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Rectangle.png"))); // NOI18N
        customers.add(bcgWhite2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        clr4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clr4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/2018 ©ysr company li.png"))); // NOI18N
        customers.add(clr4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 710, -1, -1));

        bcg4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Group.png"))); // NOI18N
        customers.add(bcg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mainPanel.add(customers, "card5");

        viewCustomers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clear_customer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Clear.png"))); // NOI18N
        clear_customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clear_customerMouseClicked(evt);
            }
        });
        viewCustomers.add(clear_customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 130, 60, 60));

        deleteOval.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/deleteOval.png"))); // NOI18N
        viewCustomers.add(deleteOval, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 540, 127, 54));

        saveCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/savept.png"))); // NOI18N
        viewCustomers.add(saveCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 530, 300, 140));

        editCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/editCustomer.png"))); // NOI18N
        viewCustomers.add(editCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, 300, 140));

        BusinessName_field1.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        BusinessName_field1.setForeground(new java.awt.Color(67, 72, 77));
        BusinessName_field1.setBorder(null);
        viewCustomers.add(BusinessName_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 130, 30));

        BusinessName1.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        BusinessName1.setForeground(new java.awt.Color(67, 72, 77));
        BusinessName1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/BusinessName.png"))); // NOI18N
        viewCustomers.add(BusinessName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 210, 140));

        title_field1.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        title_field1.setForeground(new java.awt.Color(67, 72, 77));
        title_field1.setBorder(null);
        viewCustomers.add(title_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 130, 30));

        title1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Title.png"))); // NOI18N
        viewCustomers.add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 210, 140));

        surname_field1.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        surname_field1.setForeground(new java.awt.Color(67, 72, 77));
        surname_field1.setBorder(null);
        viewCustomers.add(surname_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 130, 30));

        surname1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Surname.png"))); // NOI18N
        viewCustomers.add(surname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 210, 140));

        others_field1.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        others_field1.setForeground(new java.awt.Color(67, 72, 77));
        others_field1.setBorder(null);
        viewCustomers.add(others_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 250, 180, 30));

        othername1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Othernames.png"))); // NOI18N
        viewCustomers.add(othername1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, 260, 140));

        firstname_field1.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        firstname_field1.setForeground(new java.awt.Color(67, 72, 77));
        firstname_field1.setBorder(null);
        viewCustomers.add(firstname_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 250, 130, 30));

        firstname1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Firstname.png"))); // NOI18N
        viewCustomers.add(firstname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 210, 210, 140));

        address_field1.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        address_field1.setForeground(new java.awt.Color(67, 72, 77));
        address_field1.setBorder(null);
        viewCustomers.add(address_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 380, 30));

        address1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/address.png"))); // NOI18N
        viewCustomers.add(address1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 470, 140));

        phonenumber_field1.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        phonenumber_field1.setForeground(new java.awt.Color(67, 72, 77));
        phonenumber_field1.setBorder(null);
        viewCustomers.add(phonenumber_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 180, 30));

        phonenumber1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/phoneNumber.png"))); // NOI18N
        viewCustomers.add(phonenumber1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 260, 140));

        email_field1.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        email_field1.setForeground(new java.awt.Color(67, 72, 77));
        email_field1.setBorder(null);
        viewCustomers.add(email_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 360, 210, 30));

        customer_email1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/email.png"))); // NOI18N
        viewCustomers.add(customer_email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 320, 280, 140));

        ledgerName_field1.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        ledgerName_field1.setForeground(new java.awt.Color(67, 72, 77));
        ledgerName_field1.setBorder(null);
        viewCustomers.add(ledgerName_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 470, 140, 30));

        ledgerName1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/LedgerName.png"))); // NOI18N
        viewCustomers.add(ledgerName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 430, 210, 140));

        openingBalance_field1.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        openingBalance_field1.setForeground(new java.awt.Color(67, 72, 77));
        openingBalance_field1.setBorder(null);
        viewCustomers.add(openingBalance_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 470, 180, 30));

        openingBalance1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/opening Balance.png"))); // NOI18N
        viewCustomers.add(openingBalance1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 430, 260, 140));

        creditLimit_field1.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        creditLimit_field1.setForeground(new java.awt.Color(67, 72, 77));
        creditLimit_field1.setBorder(null);
        viewCustomers.add(creditLimit_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, 190, 30));

        creditlimit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/creditLimit.png"))); // NOI18N
        viewCustomers.add(creditlimit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 260, 140));

        pricecategory_field1.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        pricecategory_field1.setForeground(new java.awt.Color(67, 72, 77));
        pricecategory_field1.setBorder(null);
        viewCustomers.add(pricecategory_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 230, 30));

        pricecategory1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/price-category.png"))); // NOI18N
        viewCustomers.add(pricecategory1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 310, 140));

        regulate_field1.setFont(new java.awt.Font("Futura Md BT", 0, 20)); // NOI18N
        regulate_field1.setForeground(new java.awt.Color(67, 72, 77));
        regulate_field1.setBorder(null);
        viewCustomers.add(regulate_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 570, 180, 30));

        regulate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/regulate.png"))); // NOI18N
        viewCustomers.add(regulate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 530, 260, 140));

        customerRectangle1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/customerView.png"))); // NOI18N
        viewCustomers.add(customerRectangle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 1016, 531));

        RectangleModal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Rectangle Modal.png"))); // NOI18N
        viewCustomers.add(RectangleModal, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 53, 1183, 639));

        clr8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clr8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/2018 ©ysr company li.png"))); // NOI18N
        viewCustomers.add(clr8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 710, -1, -1));

        btn_logoutcustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/logout.png"))); // NOI18N
        btn_logoutcustomer.setText("jLabel1");
        btn_logoutcustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logoutcustomerMouseClicked(evt);
            }
        });
        viewCustomers.add(btn_logoutcustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 700, 127, 54));

        customerRectangle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/viewRectangle.png"))); // NOI18N
        viewCustomers.add(customerRectangle, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 1022, 492));

        search_customer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/searchCustomer.png"))); // NOI18N
        viewCustomers.add(search_customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 257, 54));

        delete_customer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/delete.png"))); // NOI18N
        delete_customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_customerMouseClicked(evt);
            }
        });
        viewCustomers.add(delete_customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 127, 54));

        Add_viewcustomers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/addOpaque.png"))); // NOI18N
        Add_viewcustomers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Add_viewcustomersMouseClicked(evt);
            }
        });
        viewCustomers.add(Add_viewcustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 105, 55));

        view_viewcustomers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/viewStroke.png"))); // NOI18N
        viewCustomers.add(view_viewcustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 130, -1));

        paint_bucket_img4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paint_bucket_img4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/paint-bucket.png"))); // NOI18N
        viewCustomers.add(paint_bucket_img4, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 95, 19, 27));

        paint_bucket4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paint_bucket4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Oval_rectangle.png"))); // NOI18N
        viewCustomers.add(paint_bucket4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 55, 54));

        database_img3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        database_img3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/database.png"))); // NOI18N
        viewCustomers.add(database_img3, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 165, 28, 28));

        database3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        database3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Oval_rectangle.png"))); // NOI18N
        viewCustomers.add(database3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 55, 54));

        folder_img3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        folder_img3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/folder.png"))); // NOI18N
        viewCustomers.add(folder_img3, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 235, 33, 28));

        folder3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        folder3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Oval_rectangle.png"))); // NOI18N
        viewCustomers.add(folder3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 55, 54));

        image_img3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image_img3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/image.png"))); // NOI18N
        viewCustomers.add(image_img3, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 305, 30, 30));

        image3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Oval_rectangle.png"))); // NOI18N
        viewCustomers.add(image3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 55, 54));

        coins_img3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coins_img3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/coins_little.png"))); // NOI18N
        viewCustomers.add(coins_img3, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 375, 26, 26));

        coins3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coins3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Oval_rectangle.png"))); // NOI18N
        viewCustomers.add(coins3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 55, 54));

        bcgWhite6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bcgWhite6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Rectangle.png"))); // NOI18N
        viewCustomers.add(bcgWhite6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        bcg8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/image/Group.png"))); // NOI18N
        viewCustomers.add(bcg8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mainPanel.add(viewCustomers, "card11");

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

        setBounds(0, 0, 1280, 780);
    }// </editor-fold>//GEN-END:initComponents

    private void m_prdtsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_prdtsMouseClicked
        
        mainPanel.removeAll();
        mainPanel.validate();
        mainPanel.repaint();
        mainPanel.add(mainmenuPrdt);
        mainPanel.revalidate();
        mainPanel.repaint();
    }//GEN-LAST:event_m_prdtsMouseClicked

    private void gobtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gobtnMouseClicked
        //Going to Login Panel
        
        mainPanel.removeAll();
        mainPanel.validate();
        mainPanel.repaint();
        mainPanel.add(login);
        mainPanel.revalidate();
        mainPanel.repaint();
    }//GEN-LAST:event_gobtnMouseClicked

    private void m_cutsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_cutsMouseClicked
//        btnAddcust.setIcon(new ImageIcon(getClass().getResource("/pack/image/Customersadd-stroke.png")));
        
        mainPanel.removeAll();
        mainPanel.validate();
        mainPanel.repaint();
        mainPanel.add(customers);
        mainPanel.revalidate();
        mainPanel.repaint();
    }//GEN-LAST:event_m_cutsMouseClicked

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        // Going Back to Menu Panel
        mainPanel.removeAll();
        mainPanel.validate();
        mainPanel.repaint();
        mainPanel.add(menu);
        mainPanel.revalidate();
        mainPanel.repaint();
    }//GEN-LAST:event_BackMouseClicked

    private void open_appMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_open_appMouseClicked
        // Going to Menu Panel
        
        mainPanel.removeAll();
        mainPanel.validate();
        mainPanel.repaint();
        mainPanel.add(menu);
        mainPanel.revalidate();
        mainPanel.repaint();
    }//GEN-LAST:event_open_appMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // Going to login Panel
        
        mainPanel.removeAll();
        mainPanel.validate();
        mainPanel.repaint();
        mainPanel.add(login);
        mainPanel.revalidate();
        mainPanel.repaint();
    }//GEN-LAST:event_backMouseClicked

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        // Logout
        
        mainPanel.removeAll();
        mainPanel.validate();
        mainPanel.repaint();
        mainPanel.add(overview);
        mainPanel.revalidate();
        mainPanel.repaint();
    }//GEN-LAST:event_LogoutMouseClicked

    private void log_outMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_log_outMouseClicked
        // Logout
        
        mainPanel.removeAll();
        mainPanel.validate();
        mainPanel.repaint();
        mainPanel.add(overview);
        mainPanel.revalidate();
        mainPanel.repaint();
    }//GEN-LAST:event_log_outMouseClicked

    private void paint_productsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paint_productsMouseClicked
        // Going To Add Products Panel
        
        mainPanel.removeAll();
        mainPanel.validate();
        mainPanel.repaint();
        mainPanel.add(products);
        mainPanel.revalidate();
        mainPanel.repaint();
    }//GEN-LAST:event_paint_productsMouseClicked

    private void back_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_btnMouseClicked
        // Going back to menu Panel
        
        mainPanel.removeAll();
        mainPanel.validate();
        mainPanel.repaint();
        mainPanel.add(mainmenuPrdt);
        mainPanel.revalidate();
        mainPanel.repaint();
    }//GEN-LAST:event_back_btnMouseClicked

    private void btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseClicked
        // Going back to overview Panel
        
        mainPanel.removeAll();
        mainPanel.validate();
        mainPanel.repaint();
        mainPanel.add(overview);
        mainPanel.revalidate();
        mainPanel.repaint();
    }//GEN-LAST:event_btn_logoutMouseClicked

    private void btn_logoutviewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutviewMouseClicked
        // Logout
        
        mainPanel.removeAll();
        mainPanel.validate();
        mainPanel.repaint();
        mainPanel.add(overview);
        mainPanel.revalidate();
        mainPanel.repaint();
    }//GEN-LAST:event_btn_logoutviewMouseClicked

    private void ViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewMouseClicked
        // Move to View Products Panel
        
        mainPanel.removeAll();
        mainPanel.validate();
        mainPanel.repaint();
        mainPanel.add(viewproducts);
        mainPanel.revalidate();
        mainPanel.repaint();
    }//GEN-LAST:event_ViewMouseClicked

    private void viewback_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewback_btnMouseClicked
        // Go Back to Products Panel
        
        mainPanel.removeAll();
        mainPanel.validate();
        mainPanel.repaint();
        mainPanel.add(products);
        mainPanel.revalidate();
        mainPanel.repaint();
    }//GEN-LAST:event_viewback_btnMouseClicked

    private void View_customersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_View_customersMouseClicked
        // Go to ViewCustomer's Panel
        
        
        
        mainPanel.removeAll();
        mainPanel.validate();
        mainPanel.repaint();
        mainPanel.add(viewCustomers);
        mainPanel.revalidate();
        mainPanel.repaint();
    }//GEN-LAST:event_View_customersMouseClicked

    private void customers_btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customers_btn_logoutMouseClicked
        // Log Out
        
        mainPanel.removeAll();
        mainPanel.validate();
        mainPanel.repaint();
        mainPanel.add(overview);
        mainPanel.revalidate();
        mainPanel.repaint();
    }//GEN-LAST:event_customers_btn_logoutMouseClicked

    private void customerback_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerback_btnMouseClicked
        // Go Back to Menu Panel
        
        mainPanel.removeAll();
        mainPanel.validate();
        mainPanel.repaint();
        mainPanel.add(menu);
        mainPanel.revalidate();
        mainPanel.repaint();
    }//GEN-LAST:event_customerback_btnMouseClicked

    private void Add_viewproductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_viewproductsMouseClicked
        // Go to Product Panel
        
        mainPanel.removeAll();
        mainPanel.validate();
        mainPanel.repaint();
        mainPanel.add(products);
        mainPanel.revalidate();
        mainPanel.repaint();
    }//GEN-LAST:event_Add_viewproductsMouseClicked

    private void Add_viewcustomersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_viewcustomersMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Add_viewcustomersMouseClicked

    private void btn_logoutcustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutcustomerMouseClicked
        // Logout
        
        mainPanel.removeAll();
        mainPanel.validate();
        mainPanel.repaint();
        mainPanel.add(overview);
        mainPanel.revalidate();
        mainPanel.repaint();
    }//GEN-LAST:event_btn_logoutcustomerMouseClicked

    private void gobtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gobtn1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_gobtn1MouseClicked

    private void settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseClicked
        // Overview Panel
        
        
        
        mainPanel.removeAll();
        mainPanel.validate();
        mainPanel.repaint();
        mainPanel.add(overview2);
        mainPanel.revalidate();
        mainPanel.repaint();
        
        
    }//GEN-LAST:event_settingsMouseClicked

    private void clear_overviewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clear_overviewMouseClicked
        // Overview Panel
        
        mainPanel.removeAll();
        mainPanel.validate();
        mainPanel.repaint();
        mainPanel.add(overview);
        mainPanel.revalidate();
        mainPanel.repaint();
    }//GEN-LAST:event_clear_overviewMouseClicked

    private void gobtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gobtn2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_gobtn2MouseClicked

    private void clear_overview3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clear_overview3MouseClicked
        // TODO add your handling code here:
        
        mainPanel.removeAll();
        mainPanel.validate();
        mainPanel.repaint();
        mainPanel.add(overview);
        mainPanel.revalidate();
        mainPanel.repaint();
    }//GEN-LAST:event_clear_overview3MouseClicked

    private void delete_customerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_customerMouseClicked
        // TODO add your handling code here:
        
        VisibleCustomers();
    }//GEN-LAST:event_delete_customerMouseClicked

    private void delete_productMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_productMouseClicked
        // TODO add your handling code here:
        
        visibleProduct();
    }//GEN-LAST:event_delete_productMouseClicked

    private void clear_productMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clear_productMouseClicked
        // TODO add your handling code here:
        
        viewProduct();
        
        mainPanel.removeAll();
        mainPanel.validate();
        mainPanel.repaint();
        mainPanel.add(products);
        mainPanel.revalidate();
        mainPanel.repaint();
    }//GEN-LAST:event_clear_productMouseClicked

    private void clear_customerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clear_customerMouseClicked
        // TODO add your handling code here:
        
        ViewCustomers();
        
        mainPanel.removeAll();
        mainPanel.validate();
        mainPanel.repaint();
        mainPanel.add(customers);
        mainPanel.revalidate();
        mainPanel.repaint();
    }//GEN-LAST:event_clear_customerMouseClicked

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
    private javax.swing.JLabel Add;
    private javax.swing.JLabel Add_customers;
    private javax.swing.JLabel Add_viewcustomers;
    private javax.swing.JLabel Add_viewproducts;
    private javax.swing.JLabel Back;
    private javax.swing.JLabel BusinessName;
    private javax.swing.JLabel BusinessName1;
    private javax.swing.JTextField BusinessName_field;
    private javax.swing.JTextField BusinessName_field1;
    private javax.swing.JTextField IP;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel RectangleModal;
    private javax.swing.JLabel RectangleModal1;
    private javax.swing.JLabel Rectangleview;
    private javax.swing.JLabel Sidebar;
    private javax.swing.JLabel View;
    private javax.swing.JLabel View_customers;
    private javax.swing.JLabel add_productBtn;
    private javax.swing.JLabel add_products;
    private javax.swing.JLabel addcustomer;
    private javax.swing.JLabel address;
    private javax.swing.JLabel address1;
    private javax.swing.JTextField address_field;
    private javax.swing.JTextField address_field1;
    private javax.swing.JLabel back;
    private javax.swing.JLabel back_btn;
    private javax.swing.JLabel bcg;
    private javax.swing.JLabel bcg1;
    private javax.swing.JLabel bcg10;
    private javax.swing.JLabel bcg11;
    private javax.swing.JLabel bcg12;
    private javax.swing.JLabel bcg3;
    private javax.swing.JLabel bcg4;
    private javax.swing.JLabel bcg6;
    private javax.swing.JLabel bcg7;
    private javax.swing.JLabel bcg8;
    private javax.swing.JLabel bcg9;
    private javax.swing.JLabel bcgWhite;
    private javax.swing.JLabel bcgWhite1;
    private javax.swing.JLabel bcgWhite2;
    private javax.swing.JLabel bcgWhite5;
    private javax.swing.JLabel bcgWhite6;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel btn_logout;
    private javax.swing.JLabel btn_logoutcustomer;
    private javax.swing.JLabel btn_logoutview;
    private javax.swing.JLabel change;
    private javax.swing.JLabel changeIP;
    private javax.swing.JLabel changeIP_field;
    private javax.swing.JLabel clear;
    private javax.swing.JLabel clear_customer;
    private javax.swing.JLabel clear_overview;
    private javax.swing.JLabel clear_overview3;
    private javax.swing.JLabel clear_product;
    private javax.swing.JLabel clr;
    private javax.swing.JLabel clr1;
    private javax.swing.JLabel clr10;
    private javax.swing.JLabel clr2;
    private javax.swing.JLabel clr4;
    private javax.swing.JLabel clr6;
    private javax.swing.JLabel clr7;
    private javax.swing.JLabel clr8;
    private javax.swing.JLabel clr9;
    private javax.swing.JLabel coins;
    private javax.swing.JLabel coins1;
    private javax.swing.JLabel coins2;
    private javax.swing.JLabel coins3;
    private javax.swing.JLabel coins_img;
    private javax.swing.JLabel coins_img1;
    private javax.swing.JLabel coins_img2;
    private javax.swing.JLabel coins_img3;
    private javax.swing.JTextField costPrice_field;
    private javax.swing.JTextField costPrice_field1;
    private javax.swing.JLabel cost_price;
    private javax.swing.JLabel cost_price1;
    private javax.swing.JLabel cost_price_txt;
    private javax.swing.JTextField creditLimit_field;
    private javax.swing.JTextField creditLimit_field1;
    private javax.swing.JLabel creditlimit;
    private javax.swing.JLabel creditlimit1;
    private javax.swing.JLabel customerRectangle;
    private javax.swing.JLabel customerRectangle1;
    private javax.swing.JLabel customer_email;
    private javax.swing.JLabel customer_email1;
    private javax.swing.JLabel customer_label;
    private javax.swing.JLabel customerback_btn;
    private javax.swing.JPanel customers;
    private javax.swing.JLabel customers_btn_logout;
    private javax.swing.JLabel database;
    private javax.swing.JLabel database1;
    private javax.swing.JLabel database2;
    private javax.swing.JLabel database3;
    private javax.swing.JLabel database_img;
    private javax.swing.JLabel database_img1;
    private javax.swing.JLabel database_img2;
    private javax.swing.JLabel database_img3;
    private javax.swing.JLabel date;
    private javax.swing.JLabel date1;
    private javax.swing.JTextField date_field;
    private javax.swing.JTextField date_field1;
    private javax.swing.JLabel date_txt;
    private javax.swing.JLabel deleteOval;
    private javax.swing.JLabel deleteProduct;
    private javax.swing.JLabel delete_customer;
    private javax.swing.JLabel delete_product;
    private javax.swing.JLabel down;
    private javax.swing.JLabel editCustomer;
    private javax.swing.JLabel editProduct;
    private javax.swing.JTextField email;
    private javax.swing.JTextField email1;
    private javax.swing.JTextField email2;
    private javax.swing.JTextField email_field;
    private javax.swing.JTextField email_field1;
    private javax.swing.JLabel email_label;
    private javax.swing.JLabel email_label1;
    private javax.swing.JLabel email_label2;
    private javax.swing.JLabel firstname;
    private javax.swing.JLabel firstname1;
    private javax.swing.JTextField firstname_field;
    private javax.swing.JTextField firstname_field1;
    private javax.swing.JLabel folder;
    private javax.swing.JLabel folder1;
    private javax.swing.JLabel folder2;
    private javax.swing.JLabel folder3;
    private javax.swing.JLabel folder_img;
    private javax.swing.JLabel folder_img1;
    private javax.swing.JLabel folder_img2;
    private javax.swing.JLabel folder_img3;
    private javax.swing.JPanel formPanel;
    private javax.swing.JPanel formPanel1;
    private javax.swing.JPanel formPanel2;
    private javax.swing.JLabel future_us;
    private javax.swing.JLabel gobtn;
    private javax.swing.JLabel gobtn1;
    private javax.swing.JLabel gobtn2;
    private javax.swing.JLabel image;
    private javax.swing.JLabel image1;
    private javax.swing.JLabel image2;
    private javax.swing.JLabel image3;
    private javax.swing.JLabel image_img;
    private javax.swing.JLabel image_img1;
    private javax.swing.JLabel image_img2;
    private javax.swing.JLabel image_img3;
    private javax.swing.JLabel invalid;
    private javax.swing.JLabel inventory;
    private javax.swing.JLabel ledgerName;
    private javax.swing.JLabel ledgerName1;
    private javax.swing.JTextField ledgerName_field;
    private javax.swing.JTextField ledgerName_field1;
    private javax.swing.JLabel litres;
    private javax.swing.JLabel litres1;
    private javax.swing.JTextField litres_field;
    private javax.swing.JTextField litres_field1;
    private javax.swing.JLabel litres_txt;
    private javax.swing.JLabel log_out;
    private javax.swing.JPanel login;
    private javax.swing.JLabel logoName;
    private javax.swing.JLabel logoName1;
    private javax.swing.JLabel logoName2;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel m_cuts;
    private javax.swing.JLabel m_invoice;
    private javax.swing.JLabel m_manAdm;
    private javax.swing.JLabel m_prdts;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel mainmenuPrdt;
    private javax.swing.JTextField masterCode_field;
    private javax.swing.JTextField masterCode_field1;
    private javax.swing.JLabel master_code;
    private javax.swing.JLabel master_code1;
    private javax.swing.JLabel master_code_txt;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel mock;
    private javax.swing.JLabel mock1;
    private javax.swing.JLabel mock2;
    private javax.swing.JLabel nothing;
    private javax.swing.JLabel open_app;
    private javax.swing.JLabel openingBalance;
    private javax.swing.JLabel openingBalance1;
    private javax.swing.JTextField openingBalance_field;
    private javax.swing.JTextField openingBalance_field1;
    private javax.swing.JLabel other_products;
    private javax.swing.JLabel othername;
    private javax.swing.JLabel othername1;
    private javax.swing.JTextField others_field;
    private javax.swing.JTextField others_field1;
    private javax.swing.JPanel overview;
    private javax.swing.JPanel overview2;
    private javax.swing.JPanel overview3;
    private javax.swing.JPanel p1;
    private javax.swing.JLabel p_type_txt;
    private javax.swing.JTextField paintCode_field;
    private javax.swing.JTextField paintCode_field1;
    private javax.swing.JTextField paintColor_field;
    private javax.swing.JTextField paintColor_field1;
    private javax.swing.JTextField paintType_field;
    private javax.swing.JTextField paintType_field1;
    private javax.swing.JLabel paint_bucket;
    private javax.swing.JLabel paint_bucket2;
    private javax.swing.JLabel paint_bucket3;
    private javax.swing.JLabel paint_bucket4;
    private javax.swing.JLabel paint_bucket_img;
    private javax.swing.JLabel paint_bucket_img2;
    private javax.swing.JLabel paint_bucket_img3;
    private javax.swing.JLabel paint_bucket_img4;
    private javax.swing.JLabel paint_code;
    private javax.swing.JLabel paint_code1;
    private javax.swing.JLabel paint_code_txt;
    private javax.swing.JLabel paint_color;
    private javax.swing.JLabel paint_color1;
    private javax.swing.JLabel paint_color_txt;
    private javax.swing.JLabel paint_customers;
    private javax.swing.JLabel paint_products;
    private javax.swing.JLabel paint_type;
    private javax.swing.JLabel paint_type1;
    private javax.swing.JLabel paint_type_txt;
    private javax.swing.JLabel password;
    private javax.swing.JLabel password1;
    private javax.swing.JLabel password2;
    private javax.swing.JTextField password_field;
    private javax.swing.JTextField password_field1;
    private javax.swing.JTextField password_field2;
    private javax.swing.JLabel phonenumber;
    private javax.swing.JLabel phonenumber1;
    private javax.swing.JTextField phonenumber_field;
    private javax.swing.JTextField phonenumber_field1;
    private javax.swing.JLabel price;
    private javax.swing.JLabel pricecategory;
    private javax.swing.JLabel pricecategory1;
    private javax.swing.JTextField pricecategory_field;
    private javax.swing.JTextField pricecategory_field1;
    private javax.swing.JLabel producer;
    private javax.swing.JLabel producer1;
    private javax.swing.JTextField producer_field;
    private javax.swing.JTextField producer_field1;
    private javax.swing.JLabel producer_text;
    private javax.swing.JLabel product_label;
    private javax.swing.JLabel product_txt;
    private javax.swing.JLabel product_type;
    private javax.swing.JLabel product_type1;
    private javax.swing.JPanel products;
    private javax.swing.JTextField productype_txtfield;
    private javax.swing.JTextField productype_txtfield1;
    private javax.swing.JLabel regulate;
    private javax.swing.JLabel regulate1;
    private javax.swing.JTextField regulate_field;
    private javax.swing.JTextField regulate_field1;
    private javax.swing.JLabel right;
    private javax.swing.JLabel saveCustomer;
    private javax.swing.JLabel saveProduct;
    private javax.swing.JLabel search_customer;
    private javax.swing.JTextField sellingPrice_field;
    private javax.swing.JTextField sellingPrice_field1;
    private javax.swing.JLabel selling_price;
    private javax.swing.JLabel selling_price1;
    private javax.swing.JLabel selling_price_txt;
    private javax.swing.JLabel settings;
    private javax.swing.JLabel settings1;
    private javax.swing.JLabel settings2;
    private javax.swing.JLabel shopping_bag;
    private javax.swing.JPanel signinform;
    private javax.swing.JPanel signinform1;
    private javax.swing.JPanel signinform2;
    private javax.swing.JLabel surname;
    private javax.swing.JLabel surname1;
    private javax.swing.JTextField surname_field;
    private javax.swing.JTextField surname_field1;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JTextField title_field;
    private javax.swing.JTextField title_field1;
    private javax.swing.JLabel up;
    private javax.swing.JLabel user;
    private javax.swing.JPanel viewCustomers;
    private javax.swing.JLabel viewProductRectangle;
    private javax.swing.JLabel viewRectangle;
    private javax.swing.JLabel view_viewcustomers;
    private javax.swing.JLabel view_viewproduct;
    private javax.swing.JLabel viewback_btn;
    private javax.swing.JPanel viewproducts;
    // End of variables declaration//GEN-END:variables
}
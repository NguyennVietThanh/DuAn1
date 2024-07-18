/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store.app.ui;

import java.awt.Color;
import static java.awt.Color.white;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import store.app.dao.KhachHangDAO;
import store.app.entity.KhachHang;
import store.app.entity.NhanVien;
import store.app.utils.Auth;
import store.app.utils.MsgBox;
import store.app.utils.XDate;

/**
 *
 * @author asus
 */
public class KhachHang_panel extends javax.swing.JPanel {

    /**
     * Creates new form NhanVien_panel
     */
    public KhachHang_panel() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgpThanhVien = new javax.swing.ButtonGroup();
        lblTitle = new javax.swing.JLabel();
        pnlDanhSach = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbKhachHang = new javax.swing.JTable();
        lblDanhSach = new javax.swing.JLabel();
        pnlChucNang = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        pnlCapNhat = new javax.swing.JPanel();
        lblMaKH = new javax.swing.JLabel();
        lblTenKH = new javax.swing.JLabel();
        lblSDT = new javax.swing.JLabel();
        lblDiaChi = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lblThanhVien = new javax.swing.JLabel();
        rdoCo = new javax.swing.JRadioButton();
        rdoKhong = new javax.swing.JRadioButton();
        pnlTimKiem = new javax.swing.JPanel();
        lblTimKiem = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtTenKH = new javax.swing.JTextField();
        txtMaKH = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnSendMail = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(30, 55, 153));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("QUẢN LÍ KHÁCH HÀNG");

        pnlDanhSach.setBackground(new java.awt.Color(255, 255, 255));

        tbKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "MÃ KH", "TÊN KH", "ĐỊA CHỈ", "SỐ ĐIỆN THOẠI", "EMAIL", "THÀNH VIÊN"
            }
        ));
        tbKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbKhachHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbKhachHang);

        lblDanhSach.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDanhSach.setText("DANH SÁCH");

        javax.swing.GroupLayout pnlDanhSachLayout = new javax.swing.GroupLayout(pnlDanhSach);
        pnlDanhSach.setLayout(pnlDanhSachLayout);
        pnlDanhSachLayout.setHorizontalGroup(
            pnlDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhSachLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDanhSachLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lblDanhSach, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlDanhSachLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        pnlDanhSachLayout.setVerticalGroup(
            pnlDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDanhSachLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDanhSach, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlChucNang.setBackground(new java.awt.Color(255, 255, 255));
        pnlChucNang.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnThem.setBackground(new java.awt.Color(246, 185, 59));
        btnThem.setForeground(new java.awt.Color(30, 55, 153));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/app/icons/them.png"))); // NOI18N
        btnThem.setText("Save");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(246, 185, 59));
        btnSua.setForeground(new java.awt.Color(30, 55, 153));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/app/icons/sua.png"))); // NOI18N
        btnSua.setText("Edit");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(246, 185, 59));
        btnXoa.setForeground(new java.awt.Color(30, 55, 153));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/app/icons/delete-button.png"))); // NOI18N
        btnXoa.setText("Delete");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnMoi.setBackground(new java.awt.Color(246, 185, 59));
        btnMoi.setForeground(new java.awt.Color(30, 55, 153));
        btnMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/app/icons/newww.png"))); // NOI18N
        btnMoi.setText("New");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        btnFirst.setBackground(new java.awt.Color(246, 185, 59));
        btnFirst.setForeground(new java.awt.Color(30, 55, 153));
        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/app/icons/last.png"))); // NOI18N
        btnFirst.setToolTipText("");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrev.setBackground(new java.awt.Color(246, 185, 59));
        btnPrev.setForeground(new java.awt.Color(30, 55, 153));
        btnPrev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/app/icons/back.png"))); // NOI18N
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnNext.setBackground(new java.awt.Color(246, 185, 59));
        btnNext.setForeground(new java.awt.Color(30, 55, 153));
        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/app/icons/next.png"))); // NOI18N
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setBackground(new java.awt.Color(246, 185, 59));
        btnLast.setForeground(new java.awt.Color(30, 55, 153));
        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/app/icons/first.png"))); // NOI18N
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlChucNangLayout = new javax.swing.GroupLayout(pnlChucNang);
        pnlChucNang.setLayout(pnlChucNangLayout);
        pnlChucNangLayout.setHorizontalGroup(
            pnlChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChucNangLayout.createSequentialGroup()
                .addComponent(btnThem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSua)
                .addGap(12, 12, 12)
                .addComponent(btnXoa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMoi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlChucNangLayout.setVerticalGroup(
            pnlChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChucNangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnMoi)
                    .addComponent(btnFirst)
                    .addComponent(btnPrev)
                    .addComponent(btnNext)
                    .addComponent(btnLast))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlCapNhat.setBackground(new java.awt.Color(255, 255, 255));
        pnlCapNhat.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblMaKH.setText("Mã khách hàng :");

        lblTenKH.setText("Tên khách hàng :");

        lblSDT.setText("Số điện thoại :");

        lblDiaChi.setText("Địa chỉ :");

        lblEmail.setText("Email :");

        lblThanhVien.setText("Thành viên :");

        bgpThanhVien.add(rdoCo);
        rdoCo.setText("Có");

        bgpThanhVien.add(rdoKhong);
        rdoKhong.setSelected(true);
        rdoKhong.setText("Không");

        pnlTimKiem.setBackground(new java.awt.Color(255, 255, 255));
        pnlTimKiem.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTimKiem.setText("Tìm kiếm :");

        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlTimKiemLayout = new javax.swing.GroupLayout(pnlTimKiem);
        pnlTimKiem.setLayout(pnlTimKiemLayout);
        pnlTimKiemLayout.setHorizontalGroup(
            pnlTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimKiemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTimKiemLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTimKiem))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnlTimKiemLayout.setVerticalGroup(
            pnlTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimKiemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTimKiem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        txtTenKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenKHActionPerformed(evt);
            }
        });

        txtMaKH.setEditable(false);
        txtMaKH.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtMaKH.setForeground(new java.awt.Color(255, 0, 0));
        txtMaKH.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMaKHFocusGained(evt);
            }
        });

        javax.swing.GroupLayout pnlCapNhatLayout = new javax.swing.GroupLayout(pnlCapNhat);
        pnlCapNhat.setLayout(pnlCapNhatLayout);
        pnlCapNhatLayout.setHorizontalGroup(
            pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCapNhatLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTenKH, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                    .addComponent(lblMaKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSDT)
                    .addComponent(txtDiaChi)
                    .addComponent(txtTenKH)
                    .addComponent(txtMaKH, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCapNhatLayout.createSequentialGroup()
                        .addComponent(rdoKhong)
                        .addGap(47, 47, 47)
                        .addComponent(rdoCo))
                    .addComponent(pnlTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEmail))
                .addGap(23, 23, 23))
        );
        pnlCapNhatLayout.setVerticalGroup(
            pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCapNhatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaKH)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCapNhatLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblThanhVien)
                        .addGap(18, 18, 18)
                        .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdoCo)
                            .addComponent(rdoKhong))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCapNhatLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblTenKH)
                        .addGap(8, 8, 8)
                        .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSDT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDiaChi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        btnSendMail.setText("Send Mail");
        btnSendMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendMailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDanhSach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlCapNhat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlChucNang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSendMail, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(btnSendMail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDanhSach, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(pnlChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public boolean validateForm() {//kiểm tra nhập liệu để trống
        if (txtTenKH.getText().isEmpty() || 
            txtSDT.getText().isEmpty() || txtEmail.getText().isEmpty()) {
            return false;
        }
        return true;
    }
    
    public boolean checkTrungMa(JTextField txt) {//kiểm tra trùng mã khách hàng
        txt.setBackground(white);
        if (dao.selectById(txt.getText()) == null) {
            return true;
        } else {
            txt.setBackground(Color.pink);
            MsgBox.showMessageDialog(this,"Mã khách hàng "+ txt.getText()+ " đã tồn tại");
            return false;
        }
    }
    
    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        this.fillTable();
    }//GEN-LAST:event_txtTimKiemKeyReleased

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        this.first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        this.prev();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        this.next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        this.last();
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        StringBuilder sb= new StringBuilder();
        checkEmail(txtEmail, sb);
        checkSDT(txtSDT, sb);
        
        if (validateForm()) {    
            if (sb.length() > 0) {
                JOptionPane.showMessageDialog(this, sb.toString(), "INVALID DATA !", JOptionPane.ERROR_MESSAGE);
                return;
                }
                insert(); 
        }else{
            MsgBox.showMessageDialog(this, "Bạn chưa nhập đầy đủ thông tin !");
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if(MsgBox.showConfirmDialog(this, "Bạn thực sự muốn cập nhật nhân viên này")) {
            StringBuilder sb= new StringBuilder();
            checkEmail(txtEmail, sb);
            checkSDT(txtSDT, sb);
            if (sb.length() > 0) {
                JOptionPane.showMessageDialog(this, sb.toString(), "INVALID DATA !", JOptionPane.ERROR_MESSAGE);
                return;
            }
            this.update();
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        this.delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        this.clearForm();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void tbKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbKhachHangMouseClicked
        if (evt.getClickCount()==1) {
            this.row = tbKhachHang.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tbKhachHangMouseClicked

    private void txtTenKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenKHActionPerformed

    private void txtMaKHFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaKHFocusGained
        txtMaKH.setBackground(white);
    }//GEN-LAST:event_txtMaKHFocusGained

    private void btnSendMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendMailActionPerformed
        Mail mail = new Mail();
        mail.setVisible(true);
//        this.disable();
    }//GEN-LAST:event_btnSendMailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgpThanhVien;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnSendMail;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDanhSach;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblMaKH;
    private javax.swing.JLabel lblSDT;
    private javax.swing.JLabel lblTenKH;
    private javax.swing.JLabel lblThanhVien;
    private javax.swing.JLabel lblTimKiem;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlCapNhat;
    private javax.swing.JPanel pnlChucNang;
    private javax.swing.JPanel pnlDanhSach;
    private javax.swing.JPanel pnlTimKiem;
    private javax.swing.JRadioButton rdoCo;
    private javax.swing.JRadioButton rdoKhong;
    private javax.swing.JTable tbKhachHang;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    void init(){
        fillTable();
        viewTable();
    }
    
    KhachHangDAO dao = new KhachHangDAO();
    
    void fillTable(){
    //tìm kiếm khách hàng theo keyword rồi đổ list khách hàng vào bảng
    //nếu không có keywork trong ô tìm kiếm thì đổ toàn bộ khách hàng trong CSDL vào bảng
        DefaultTableModel model = (DefaultTableModel) tbKhachHang.getModel();
        model.setRowCount(0);
        try {
            String keyword = txtTimKiem.getText();
            List<KhachHang> list = dao.selectByKeyword(keyword);
            for (KhachHang nv : list) {
                Object[] row = {
                    nv.getMaKH(),
                    nv.getTenKH(),
                    nv.getDiaChi(),
                    nv.getSdt(),
                    nv.getEmail(),
                    nv.isThanhVien()?"Có" :"Không"
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.showMessageDialog(this, "Lỗi truy vấn dữ liệu");
            e.printStackTrace();
        }
    }
    
    KhachHang getForm(){    
    //lấy thông tin trên form cho vào đt khách hàng
    //return khách hàng
    
        KhachHang kh = new KhachHang();
        kh.setMaKH(txtMaKH.getText());
        kh.setTenKH(txtTenKH.getText());
        kh.setDiaChi(txtDiaChi.getText());
        kh.setSdt(txtSDT.getText());
        kh.setEmail(txtEmail.getText());
        boolean thanhvien = true; //mac dinh la khong
        if (rdoCo.isSelected()) {
            thanhvien = true;//có
        }else{
            thanhvien=false;
        }
        kh.setThanhVien(thanhvien);
        return kh;
    }
    
    void setForm(KhachHang kh) {
        txtMaKH.setText(kh.getMaKH());
        txtTenKH.setText(kh.getTenKH());
        txtDiaChi.setText(kh.getDiaChi());
        txtSDT.setText(kh.getSdt());
        txtEmail.setText(kh.getEmail());
        if (kh.isThanhVien()==true) {
            rdoCo.setSelected(true);
        } else {
            rdoKhong.setSelected(true);
        }
    }
    
    int row = -1; //chứa vị trí hiện hành của khách hàng
    void updateStatus(){  //cập nhật trạng thái form
          boolean edit = (this.row >= 0); //đang chọn một hàng nào đó ->> trạng thái edit
          boolean first = (this.row == 0); //đang ở bản ghi đầu tiên 
          boolean last = (this.row == tbKhachHang.getRowCount() - 1); // đang ở bản ghi cuối cùng
          
          //trạng thái form
          txtMaKH.setEditable(!edit);
          btnThem.setEnabled(!edit);
          btnSua.setEnabled(edit);
          btnXoa.setEnabled(edit);
          
          //trạng thái điều hướng 
          btnFirst.setEnabled(edit && !first);
          btnPrev.setEnabled(edit && !first);
          btnNext.setEnabled(edit && !last);
          btnLast.setEnabled(edit && !last);
    }
    
    void edit(){//điền thông tin đt nhanVien lên form (theo vị trí row)
        try {
          String maKH = (String) tbKhachHang.getValueAt(this.row,0);
          KhachHang kh = dao.selectById(maKH);
          this.setForm(kh);
          this.updateStatus();
        } catch (Exception e) {
            MsgBox.showMessageDialog(this, "Lỗi truy vấn dữ liệu");
            e.printStackTrace();
        }  
    }
    void first(){
          this.row = 0;
          this.edit();
          tbKhachHang.setRowSelectionInterval(row, row);
    }
    
    void prev(){
          if (this.row > 0) {
              this.row--;
              this.edit();
              tbKhachHang.setRowSelectionInterval(row, row);
          }
    }
      
    void next(){
           if (this.row < tbKhachHang.getRowCount() - 1) {
              this.row++;
              this.edit();
              tbKhachHang.setRowSelectionInterval(row, row);
          } 
    }
    
    void last(){
           this.row = tbKhachHang.getRowCount() -1 ;
           this.edit();
           tbKhachHang.setRowSelectionInterval(row, row);
    }
    
    void clearForm(){ //xóa trắng form
          this.setForm(new KhachHang());
          this.row = -1;
          this.updateStatus();
          rdoKhong.setSelected(true);
          txtMaKH.setBackground(white);
          txtMaKH.setEditable(false);
    }
    
    void insert(){
    //lấy thông tin trên form để
    //thêm (đăng kí) khách hàng - quản lí vào CSDL
          KhachHang model = getForm();
          try {
              dao.insert(model);
              this.fillTable();
              this.clearForm();
              MsgBox.showMessageDialog(this, "Thêm mới khách hàng thành công");
          } catch (Exception e) {
              MsgBox.showMessageDialog(this, "Thêm mới khách hàng thất bại !");
              e.printStackTrace();
          }
      }

      void update(){
    //lấy thông tin trên form để
    //cập nhật nhanVien theo maKH
          KhachHang model = getForm();
          try {
              dao.update(model);
              this.fillTable();
              this.clearForm();
              MsgBox.showMessageDialog(this, "Cập khách hàng viên thành công");
          } catch (Exception e) {
              MsgBox.showMessageDialog(this, "Cập nhật khách hàng thất bại !");
              e.printStackTrace();
          }
      }
      
      void delete(){
    //lấy maKH trên form, xóa khách hàng theo maKH
    //xóa trắng form
              String maKH = txtMaKH.getText();
              if  (MsgBox.showConfirmDialog(this, "Bạn thực sự muốn xóa khách hàng này ?")) {
                  try {
                    dao.delete(maKH);
                    this.fillTable();
                    this.clearForm();
                    MsgBox.showMessageDialog(this, "Xóa khách hàng thành công !");
                  }catch (Exception e) {
                    MsgBox.showMessageDialog(this, "Không thể xóa khách hàng này!");   
              }
        }      
    }
      
     public static boolean checkEmail(JTextField field, StringBuilder sb) {
        boolean ok = true;

        Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+");

        Matcher matcher = pattern.matcher(field.getText());

        if (!matcher.find()) {
            sb.append("Email không hợp lệ\n");
            ok = false;
        }
        return ok;
    }
     
     public static boolean checkSDT(JTextField field, StringBuilder sb) {
        boolean ok = true;

        Pattern pattern = Pattern.compile("(0?)(3[2-9]|5[6|8|9]"
                + "|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])[0-9]{7}$"); //biểu thức chính quy số điện thoại VN tìm từ trên mạng
//        Pattern pattern = Pattern.compile("^[0-9._-]{10,11}$"); phải là số và có từ 10 đến 11 kí tự
        
        Matcher matcher = pattern.matcher(field.getText());

        if (!matcher.find()) {
            sb.append("Số điện thoại không hợp lệ");
            ok = false;
        }
        return ok;
    }
     
    void viewTable(){
        tbKhachHang.getColumnModel().getColumn(0).setPreferredWidth(40);
        tbKhachHang.getColumnModel().getColumn(1).setPreferredWidth(110);
        tbKhachHang.getColumnModel().getColumn(2).setPreferredWidth(110);
        tbKhachHang.getColumnModel().getColumn(3).setPreferredWidth(90);
        tbKhachHang.getColumnModel().getColumn(4).setPreferredWidth(100);
        tbKhachHang.getColumnModel().getColumn(5).setPreferredWidth(70);
        tbKhachHang.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
    }
}
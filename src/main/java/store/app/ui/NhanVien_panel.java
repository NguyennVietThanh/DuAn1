/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store.app.ui;

import java.awt.Color;
import static java.awt.Color.white;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import store.app.dao.NhanVienDao;
import store.app.entity.NhanVien;
import store.app.utils.Auth;
import store.app.utils.MsgBox;
import store.app.utils.XDate;

/**
 *
 * @author asus
 */
public class NhanVien_panel extends javax.swing.JPanel {

    /**
     * Creates new form NhanVien_panel
     */
    public NhanVien_panel() {
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

        bgpVaiTro = new javax.swing.ButtonGroup();
        lblTitle = new javax.swing.JLabel();
        pnlDanhSach = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNhanVien = new javax.swing.JTable();
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
        lblManv = new javax.swing.JLabel();
        lblTenNV = new javax.swing.JLabel();
        lblSDT = new javax.swing.JLabel();
        lblDiaChi = new javax.swing.JLabel();
        txtTenNV = new javax.swing.JTextField();
        lblGioiTinh = new javax.swing.JLabel();
        cboGioiTinh = new javax.swing.JComboBox<>();
        lblNgaySinh = new javax.swing.JLabel();
        lblMatKhau = new javax.swing.JLabel();
        lblVaiTro = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        rdoNV = new javax.swing.JRadioButton();
        rdoQL = new javax.swing.JRadioButton();
        lblMatKhau1 = new javax.swing.JLabel();
        txtXacNhanMatKhau = new javax.swing.JPasswordField();
        txtMaNV = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        dateChooser = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(30, 55, 153));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("QUẢN LÍ NHÂN VIÊN");
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        pnlDanhSach.setBackground(new java.awt.Color(255, 255, 255));

        tbNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "MÃ NV", "TÊN NV", "GIỚI TÍNH", "ĐỊA CHỈ", "SĐT", "NGÀY SINH", "MẬT KHẨU", "VAI TRÒ"
            }
        ));
        tbNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbNhanVien);

        lblDanhSach.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDanhSach.setText("DANH SÁCH");

        javax.swing.GroupLayout pnlDanhSachLayout = new javax.swing.GroupLayout(pnlDanhSach);
        pnlDanhSach.setLayout(pnlDanhSachLayout);
        pnlDanhSachLayout.setHorizontalGroup(
            pnlDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhSachLayout.createSequentialGroup()
                .addComponent(lblDanhSach, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 587, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        pnlDanhSachLayout.setVerticalGroup(
            pnlDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDanhSachLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lblDanhSach, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
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
                .addContainerGap()
                .addComponent(btnThem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSua)
                .addGap(12, 12, 12)
                .addComponent(btnXoa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMoi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
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

        lblManv.setText("Mã nhân viên :");

        lblTenNV.setText("Tên nhân viên :");

        lblSDT.setText("Số điện thoại :");

        lblDiaChi.setText("Địa chỉ :");

        lblGioiTinh.setText("Giới tính :");

        cboGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        lblNgaySinh.setText("Ngày sinh :");

        lblMatKhau.setText("Mật khẩu :");

        lblVaiTro.setText("Vài trò :");

        bgpVaiTro.add(rdoNV);
        rdoNV.setSelected(true);
        rdoNV.setText("Nhân viên");

        bgpVaiTro.add(rdoQL);
        rdoQL.setText("Quản lí");

        lblMatKhau1.setText("Xác nhận mật khẩu :");

        txtXacNhanMatKhau.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtXacNhanMatKhauFocusGained(evt);
            }
        });
        txtXacNhanMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtXacNhanMatKhauActionPerformed(evt);
            }
        });

        txtMaNV.setEditable(false);
        txtMaNV.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtMaNV.setForeground(new java.awt.Color(255, 0, 0));

        dateChooser.setDateFormatString("dd/MM/yyyy");

        javax.swing.GroupLayout pnlCapNhatLayout = new javax.swing.GroupLayout(pnlCapNhat);
        pnlCapNhat.setLayout(pnlCapNhatLayout);
        pnlCapNhatLayout.setHorizontalGroup(
            pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCapNhatLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCapNhatLayout.createSequentialGroup()
                        .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCapNhatLayout.createSequentialGroup()
                                .addComponent(lblDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(98, 98, 98))
                            .addGroup(pnlCapNhatLayout.createSequentialGroup()
                                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVaiTro, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlCapNhatLayout.createSequentialGroup()
                                .addComponent(rdoNV)
                                .addGap(18, 18, 18)
                                .addComponent(rdoQL))
                            .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(122, 122, 122))
                    .addGroup(pnlCapNhatLayout.createSequentialGroup()
                        .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTenNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblManv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlCapNhatLayout.createSequentialGroup()
                                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(90, 90, 90)
                        .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cboGioiTinh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dateChooser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))
                            .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblMatKhau1)
                                .addComponent(txtXacNhanMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23))))
        );
        pnlCapNhatLayout.setVerticalGroup(
            pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCapNhatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManv)
                    .addComponent(lblGioiTinh))
                .addGap(6, 6, 6)
                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCapNhatLayout.createSequentialGroup()
                        .addComponent(cboGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenNV)
                    .addComponent(lblNgaySinh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCapNhatLayout.createSequentialGroup()
                        .addComponent(dateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCapNhatLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMatKhau)
                            .addComponent(lblMatKhau1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtXacNhanMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblVaiTro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdoNV)
                            .addComponent(rdoQL)))
                    .addGroup(pnlCapNhatLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblSDT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDiaChi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlChucNang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDanhSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlCapNhat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(pnlCapNhat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDanhSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(pnlChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
    public boolean validateForm() {//kiểm tra nhập liệu để trống
        if (txtTenNV.getText().isEmpty() || txtMatKhau.getText().isEmpty() || 
            txtDiaChi.getText().isEmpty() || txtSDT.getText().isEmpty() 
                || txtXacNhanMatKhau.getText().isEmpty() ||
                ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText().isEmpty()) {
            return false;
        }
        return true;
    }
    
    public boolean checkTrungMa(JTextField txt) {//kiểm tra trùng mã nhân viên
        txt.setBackground(white);
        if (dao.selectById(txt.getText()) == null) {
            return true;
        } else {
            txt.setBackground(Color.pink);
            MsgBox.showMessageDialog(this,"Mã nhân viên "+ txt.getText()+ " đã tồn tại");
            return false;
        }
    }
    
    private void tbNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbNhanVienMouseClicked
        if (evt.getClickCount()==1) {
            this.row = tbNhanVien.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tbNhanVienMouseClicked

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

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        this.clearForm();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        StringBuilder sb= new StringBuilder();
        checkSDT(txtSDT, sb);
        
        String s1 = txtMatKhau.getText();
        String s2 = txtXacNhanMatKhau.getText();
        
            if (s1.equals(s2)==false) {
                MsgBox.showMessageDialog(this,  "Mật khẩu không khớp");
                txtXacNhanMatKhau.setBackground(Color.pink);
                return;
            }
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
        String s1 = txtMatKhau.getText();
        String s2 = txtXacNhanMatKhau.getText();
        StringBuilder sb= new StringBuilder();
        checkSDT(txtSDT, sb);
        
            if (s1.equals(s2)==false) {
                MsgBox.showMessageDialog(this,  "Mật khẩu không khớp");
                txtXacNhanMatKhau.setBackground(Color.pink);
                return;
            }
            if(MsgBox.showConfirmDialog(this, "Bạn thực sự muốn cập nhật nhân viên này")) {
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

    private void txtXacNhanMatKhauFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtXacNhanMatKhauFocusGained
        txtXacNhanMatKhau.setBackground(white);
    }//GEN-LAST:event_txtXacNhanMatKhauFocusGained

    private void txtXacNhanMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtXacNhanMatKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtXacNhanMatKhauActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgpVaiTro;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboGioiTinh;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDanhSach;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblManv;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblMatKhau1;
    private javax.swing.JLabel lblNgaySinh;
    private javax.swing.JLabel lblSDT;
    private javax.swing.JLabel lblTenNV;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblVaiTro;
    private javax.swing.JPanel pnlCapNhat;
    private javax.swing.JPanel pnlChucNang;
    private javax.swing.JPanel pnlDanhSach;
    private javax.swing.JRadioButton rdoNV;
    private javax.swing.JRadioButton rdoQL;
    private javax.swing.JTable tbNhanVien;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenNV;
    private javax.swing.JPasswordField txtXacNhanMatKhau;
    // End of variables declaration//GEN-END:variables

    
    public void init(){
        fillTable();
        viewTable();
    }
    
    public String matKhauToSao(String pass){
        String sao="";
        for(int i=0;i<pass.length();i++){
            sao+="*";
        }
        return sao;
    }
    
    NhanVienDao dao = new NhanVienDao();
    
    void fillTable(){
    //lấy list nhanVien từ CSDL điền vào bảng
    //LƯU Ý: CHỈ TRƯỞNG PHÒNG MỚI XEM ĐƯỢC MẬT KHẨU CỦA NGƯỜI KHÁC
        DefaultTableModel model = (DefaultTableModel) tbNhanVien.getModel();
        model.setRowCount(0);
        try {
            List<NhanVien> list = dao.selectAll();
            for (NhanVien nv : list) {
                Object[] row = {
                    nv.getMaNV(),
                    nv.getTenNV(),
                    nv.isGioiTinh() ? "Nam" : "Nữ",
                    nv.getDiaChi(),
                    nv.getSdt(),
                    XDate.toString(nv.getNgaySinh(),"dd/MM/yyyy"),
                    Auth.user.isVaiTro()?nv.getMatKhau():matKhauToSao(nv.getMatKhau()), 
                    //đăng nhập vai trò nhân viên thì mật khẩu sẽ được hiện thành dấu * và ngược lại
//                    nv.getMatKhau(),
                    nv.isVaiTro()?"Quản lí" :"Nhân viên"
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.showMessageDialog(this, "Lỗi truy vấn dữ liệu");
            e.printStackTrace();
        }
    }
       
    NhanVien getForm(){    
    //lấy thông tin trên form cho vào đt nhanVien
    //return nhanVien
    
        NhanVien nv = new NhanVien();
        nv.setMaNV(txtMaNV.getText());
        nv.setTenNV(txtTenNV.getText());
        nv.setGioiTinh(cboGioiTinh.getSelectedIndex() == 0);
        nv.setDiaChi(txtDiaChi.getText());
        nv.setSdt(txtSDT.getText());
        String ngay = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        nv.setNgaySinh(XDate.toDate(ngay, "dd/MM/yyyy"));
        nv.setMatKhau(txtMatKhau.getText());
        boolean vaitro = true; //mac dinh la nv
        if (rdoQL.isSelected()) {
            vaitro = true;//Quản lí
        }else{
            vaitro=false;
        }
        nv.setVaiTro(vaitro);
        return nv;
    }
    
    void setForm(NhanVien nv) {//đưa dữ liệu lên form
        txtMaNV.setText(nv.getMaNV());
        txtTenNV.setText(nv.getTenNV());
        txtSDT.setText(nv.getSdt());
        txtDiaChi.setText(nv.getDiaChi());
        cboGioiTinh.setSelectedIndex(nv.isGioiTinh() ? 0 : 1);
//        txtNgaySinh.setText(XDate.toString(nv.getNgaySinh(),"dd/MM/yyyy"));
        dateChooser.setDate(nv.getNgaySinh());
        txtMatKhau.setText(nv.getMatKhau());
        if (nv.isVaiTro()==true) {
            rdoQL.setSelected(true);
        } else {
            rdoNV.setSelected(true);
        }
        txtXacNhanMatKhau.setText(nv.getMatKhau());
    }
    
    int row = -1; //chứa vị trí hiện hành của nhân viên
    void updateStatus(){  //cập nhật trạng thái form
          boolean edit = (this.row >= 0); //đang chọn một hàng nào đó ->> trạng thái edit
          boolean first = (this.row == 0); //đang ở bản ghi đầu tiên 
          boolean last = (this.row == tbNhanVien.getRowCount() - 1); // đang ở bản ghi cuối cùng
          
          //trạng thái form
          txtMaNV.setEditable(!edit);
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
          String maNV = (String) tbNhanVien.getValueAt(this.row,0);
          NhanVien nv = dao.selectById(maNV);
          this.setForm(nv);
          this.updateStatus();
        } catch (Exception e) {
            MsgBox.showMessageDialog(this, "Lỗi truy vấn dữ liệu");
            e.printStackTrace();
        }  
    }
    void first(){
          this.row = 0;
          this.edit();
          tbNhanVien.setRowSelectionInterval(row, row);

    }
    
    void prev(){
          if (this.row > 0) {
              this.row--;
              this.edit();
              tbNhanVien.setRowSelectionInterval(row, row);
          }
    }
      
    void next(){
           if (this.row < tbNhanVien.getRowCount() - 1) {
              this.row++;
              this.edit();
              tbNhanVien.setRowSelectionInterval(row, row);
          } 
    }
    
    void last(){
           this.row = tbNhanVien.getRowCount() -1 ;
           this.edit();
           tbNhanVien.setRowSelectionInterval(row, row);
    }
    
    void clearForm(){ //xóa trắng form
          this.setForm(new NhanVien());
          this.row = -1;
          this.updateStatus();
          rdoNV.setSelected(true);
          txtTenNV.setBackground(white);
          cboGioiTinh.setSelectedIndex(0);
          txtMaNV.setBackground(white);
          txtXacNhanMatKhau.setText("");
          txtMaNV.setEditable(false);
    }
    
    void insert(){
    //lấy thông tin trên form để
    //thêm (đăng kí) nhân viên - quản lí vào CSDL
          NhanVien model = getForm();
          try {
              dao.insert(model);
              this.fillTable();
              this.clearForm();
              MsgBox.showMessageDialog(this, "Thêm mới nhân viên thành công");
          } catch (Exception e) {
              MsgBox.showMessageDialog(this, "Thêm mới nhân viên thất bại !");
              e.printStackTrace();
          }
      }

      void update(){
    //lấy thông tin trên form để
    //cập nhật nhanVien theo maNV
          NhanVien model = getForm();
          try {
              dao.update(model);
              this.fillTable();
              this.clearForm();
              MsgBox.showMessageDialog(this, "Cập nhật nhân viên thành công");
          } catch (Exception e) {
              MsgBox.showMessageDialog(this, "Cập nhật nhân viên thất bại !");
              e.printStackTrace();
          }
      }
      
      void delete(){
    //lấy maNV trên form, xóa nv theo maNV
    //xóa trắng form
          if (!Auth.isManager()) { //kiểm tra nếu là trưởng phòng mới có quyền xóa
              MsgBox.showMessageDialog(this, "Bạn không có quyền xóa nhân viên");
          }else{
              String manv = txtMaNV.getText();
              if (manv.equals(Auth.user.getMaNV())) {
                MsgBox.showMessageDialog(this, "Bạn không được xóa chính mình");
              }
              else if  (MsgBox.showConfirmDialog(this, "Bạn thực sự muốn xóa nhân viên này")) {
                  try {
                      dao.delete(manv);
                      this.fillTable();
                      this.clearForm();
                      MsgBox.showMessageDialog(this, "Xóa nhân viên thành công !");
                  }catch (Exception e) {
                    MsgBox.showMessageDialog(this, "Không thể xóa nhân viên");   
              }
           }
        }      
    }
      
    public static boolean checkSDT(JTextField field, StringBuilder sb) {
        boolean ok = true;

        Pattern pattern = Pattern.compile("(0?)(3[2-9]|5[6|8|9]"
        + "|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])[0-9]{7}$"); //biểu thức chính quy kiểm tra số điện thoại VN tìm từ trên mạng
//        Pattern pattern = Pattern.compile("^[0-9._-]{10,11}$"); //phải là số và có từ 10 đến 11 kí tự
        
        Matcher matcher = pattern.matcher(field.getText());

        if (!matcher.find()) {
            sb.append("Số điện thoại không hợp lệ");
            ok = false;
        }
        return ok;
    }
    
        final static String DATE_FORMAT = "dd/MM/yyyy";

        public static boolean checkNgaySinh(String date) 
        {
        try {
            DateFormat df = new SimpleDateFormat(DATE_FORMAT);
            df.setLenient(false);
            df.parse(date);
            return true;
        } catch (ParseException e) {
            return false;  
        }
        }
        
    void viewTable(){
        tbNhanVien.getColumnModel().getColumn(0).setPreferredWidth(60);
        tbNhanVien.getColumnModel().getColumn(1).setPreferredWidth(140);
        tbNhanVien.getColumnModel().getColumn(2).setPreferredWidth(80);
        tbNhanVien.getColumnModel().getColumn(3).setPreferredWidth(90);
        tbNhanVien.getColumnModel().getColumn(4).setPreferredWidth(80);
        tbNhanVien.getColumnModel().getColumn(5).setPreferredWidth(70);
        tbNhanVien.getColumnModel().getColumn(6).setPreferredWidth(70);
        tbNhanVien.getColumnModel().getColumn(7).setPreferredWidth(70);
        tbNhanVien.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
    }
      
}

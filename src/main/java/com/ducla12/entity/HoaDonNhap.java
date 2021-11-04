package com.ducla12.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table(name = "hoa_don_nhap")
@Entity
public class HoaDonNhap extends BaseTimeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "cthd_id", nullable = false)
    private Long cthdId;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

    @Column(name = "ngay_nhap")
    private LocalDateTime ngayNhap;

    public LocalDateTime getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(LocalDateTime ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Long getCthdId() {
        return cthdId;
    }

    public void setCthdId(Long cthdId) {
        this.cthdId = cthdId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
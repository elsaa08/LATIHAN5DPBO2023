/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Saya [Elsa Nabiilah] [2108805] mengerjakan LATIHAN 5 dalam mata kuliah Desain Pemrograman 
//Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan 
//seperti yang telah dispesifikasikan. Aamiin.
package daftarmahasiswa;

/**
 *
 * @author sekar
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private String nilai;
    private String gender;
    
    public Mahasiswa(String nim, String nama, String nilai, String gender){
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
        this.gender = gender;
    }
    
    public void setNim(String nim) {
        this.nim = nim;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setNilai(String nilai) {
        this.nilai = nilai;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    
    public String getNim() {
        return this.nim;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    public String getNilai() {
        return this.nilai;
    }
    public String getGender(){
        return this.gender;
    }
}

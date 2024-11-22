package com.example.week8.ui.view.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.week8.model.Mahasiswa
import com.example.week8.model.RencanaStudi

@Composable
fun Tampil(
    mhs: Mahasiswa,
    rs: RencanaStudi,
    onBackButtonClicked: () -> Unit
){
    Column (modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)){

        TampilData(
            judul = "NIM",
            isinya = mhs.nim
        )
        TampilData(
            judul = "NAMA",
            isinya = mhs.nama
        )
        TampilData(
            judul = "Email",
            isinya = mhs.email
        )
        TampilData(
            judul = "Mata Kuliah Dipilih",
            isinya = rs.namaMK
        )
        TampilData(
            judul = "Kelas Dipilih",
            isinya = rs.kelas
        )
        Spacer(modifier = Modifier.padding(20.dp))

        Button(
            onClick = { onBackButtonClicked() },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Kembali")
        }
    }
}

@Composable
fun TampilData(
    judul:String,
    isinya:String
){
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween) {
        Text(judul, modifier = Modifier.weight(0.8f))
        Text(":", modifier = Modifier.weight(0.2f))
        Text(isinya,
            modifier = Modifier.weight(2f))
    }
}
package com.example.bloom.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Preview(showBackground = true)
@Composable
fun ConstraintPractica1() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (boxRed, boxBlue, boxMagenta, boxYellow, boxGreen) = createRefs()

        Box(
            modifier = Modifier.size(100.dp).background(Color.Red).constrainAs(boxRed) {
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }
        )
        Box(
            modifier = Modifier.size(100.dp).background(Color.Blue).constrainAs(boxBlue) {
                bottom.linkTo(boxRed.top)
                end.linkTo(boxRed.start)
            }
        )
        Box(
            modifier = Modifier.size(100.dp).background(Color.Magenta).constrainAs(boxMagenta) {
                bottom.linkTo(boxRed.top)
                start.linkTo(boxRed.end)
            }
        )
        Box(
            modifier = Modifier.size(100.dp).background(Color.Yellow).constrainAs(boxYellow) {
                top.linkTo(boxRed.bottom)
                end.linkTo(boxRed.start)
            }
        )
        Box(
            modifier = Modifier.size(100.dp).background(Color.Green).constrainAs(boxGreen) {
                top.linkTo(boxRed.bottom)
                start.linkTo(boxRed.end)
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ConstraintPractica2() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (boxRed, boxBlue, boxYellow, boxMagenta, boxCyan, boxGreen, boxBlack) = createRefs()

        Box(
            modifier = Modifier.size(100.dp).background(Color.Red).constrainAs(boxRed) {
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }
        )
        Box(
            modifier = Modifier.size(100.dp).background(Color.Blue).constrainAs(boxBlue) {
                bottom.linkTo(boxRed.top)
                end.linkTo(boxRed.start)
            }
        )
        Box(
            modifier = Modifier.size(100.dp).background(Color.Yellow).constrainAs(boxYellow) {
                bottom.linkTo(boxRed.top)
                start.linkTo(boxRed.end)
            }
        )
        Box(
            modifier = Modifier.size(100.dp).background(Color.Magenta).constrainAs(boxMagenta) {
                top.linkTo(boxRed.bottom)
                end.linkTo(boxRed.start)
            }
        )
        Box(
            modifier = Modifier.size(100.dp).background(Color.Cyan).constrainAs(boxCyan) {
                top.linkTo(boxRed.bottom)
                start.linkTo(boxRed.end)
            }
        )
        Box(
            modifier = Modifier.size(100.dp).background(Color.Green).constrainAs(boxGreen) {
                bottom.linkTo(boxBlue.top)
                start.linkTo(boxRed.start)
                end.linkTo(boxRed.end)
            }
        )
        Box(
            modifier = Modifier.size(100.dp).background(Color.Black).constrainAs(boxBlack) {
                top.linkTo(boxMagenta.bottom)
                start.linkTo(boxRed.start)
                end.linkTo(boxRed.end)
            }
        )
    }
}
@Preview(showBackground = true)
@Composable
fun ConstraintPractica3() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (boxRed, boxBlue, boxMagenta, boxYellow, boxGreen, boxCyan, boxBlack1, boxBlack2) = createRefs()

        Box(
            modifier = Modifier.size(90.dp).background(Color.Red).constrainAs(boxRed) {
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }
        )
        Box(
            modifier = Modifier.size(90.dp).background(Color.Blue).constrainAs(boxBlue) {
                bottom.linkTo(boxRed.top)
                end.linkTo(boxRed.start)
            }
        )
        Box(
            modifier = Modifier.size(90.dp).background(Color.Magenta).constrainAs(boxMagenta) {
                bottom.linkTo(boxRed.top)
                start.linkTo(boxRed.end)
            }
        )
        Box(
            modifier = Modifier.size(90.dp).background(Color.Yellow).constrainAs(boxYellow) {
                top.linkTo(boxRed.bottom)
                end.linkTo(boxRed.start)
            }
        )
        Box(
            modifier = Modifier.size(90.dp).background(Color.Green).constrainAs(boxGreen) {
                top.linkTo(boxRed.bottom)
                start.linkTo(boxRed.end)
            }
        )
        // Escalera de cuadritos pequeños
        Box(
            modifier = Modifier.size(30.dp).background(Color.Cyan).constrainAs(boxCyan) {
                start.linkTo(boxBlue.end)
                bottom.linkTo(boxBlue.bottom)
            }
        )
        Box(
            modifier = Modifier.size(30.dp).background(Color.Black).constrainAs(boxBlack1) {
                start.linkTo(boxCyan.end)
                bottom.linkTo(boxCyan.top)
            }
        )
        Box(
            modifier = Modifier.size(30.dp).background(Color.Black).constrainAs(boxBlack2) {
                start.linkTo(boxBlack1.end)
                bottom.linkTo(boxBlack1.top)
            }
        )
    }
}

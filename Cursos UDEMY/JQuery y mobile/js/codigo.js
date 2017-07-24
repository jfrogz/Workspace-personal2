$(document).ready(inicio);

function inicio() {
    $("#afrodita").click(onDesaparece);
    $("#titulo").click(fondo);
}

function onDesaparece() {
    $("#afrodita").hide();
}

function fondo() {
    $("#titulo").css("background", "red");
}

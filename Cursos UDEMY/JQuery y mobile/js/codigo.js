$(document).ready(inicio);

function inicio() {
    $("#afrodita").click(onDesaparece);
    $("#titulo").click(fondo);
}

function onDesaparece() {
    $("#afrodita").hide();
    ion.sound.play("triangle");
}

function fondo() {
    $("#titulo").css("background", "red");
}

ion.sound({
    sounds: [
        {name: "beer_can_opening"},
        {name: "bell_ring"},
        {name: "branch_break"},
        {name: "button_click"},
        {name: "door_bell"},
        {name: "triangle"}
    ],

    // main config
    path: "static/sounds/",
    preload: true,
    multiplay: true,
    volume: 0.9
});
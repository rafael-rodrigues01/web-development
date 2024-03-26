// aprender a manipular o DOM
// definir qual elemento do HTML eu vou pegar, e o

/*
  Localizadores - Id mais comum #

                  CLASSE .classe
*/

// Pegar um elemento HTML.

const usuarioPermitido = 'Newgate';
const senhaPermitida = 'Newgate';

const tema = document.getElementById('divlogin')
const botao = document.querySelector('#enviar');
const mudaTema = document.querySelector('#botaoNoturno');

mudaTema.addEventListener('click', () => {
  tema.classList.remove('login');
  tema.classList.add('loginNoturno');
})

botao.addEventListener('click', e => {

  e.preventDefault();

  const usuario = document.getElementById('usuario').value;
  const senha = document.querySelector('#senha').value;

  if(usuario === usuarioPermitido && senha === senhaPermitida) {
    alert('Bem vindo');
    window.location.assign('redirect.html');
  } else if (usuario === usuarioPermitido && senha !== senhaPermitida) {
    alert('A senha não é essa:');
    window.location.assign('index.html');
  } else {
    alert('Volta para a base!');
    window.location.assign('index.html');
  }

  console.log(usuario, senha);

  window.location.assign()
});

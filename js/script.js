const form = document.querySelector('form');

form.addEventListener('submit', () => {
  let nome = document.querySelector('#idNome').value;
  alert(nome + " obrigado por se cadastrar!");
  form.reset();
});
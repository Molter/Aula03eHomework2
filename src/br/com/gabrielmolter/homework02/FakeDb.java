package br.com.gabrielmolter.homework02;

import java.util.ArrayList;

public class FakeDb {
	
	private static FakeDb mFakeDb;
	
	private static ArrayList<News> sNews = new ArrayList<News>(){
		{
			add(new News("header", "colapsed", "expanded", "source", "link"));
			add(new News("Brasil crescer 4% ao ano at� 2022", "São Paulo é O Ministro da Fazenda, Guido Mantega", "S�o Paulo � O Ministro da Fazenda, Guido Mantega, projetou que o Brasil deve registrar um crescimento no Produto Interno Bruto (PIB) de, em m�dia, 4% ao ano, a partir de 2014 at� 2022. �N�o � um grande salto, � bastante realista, eu diria at� que modesto. � suficiente para aumentar a renda per capita�, declarou durante o Semin�rio Brasil: Uma Vis�o de Dez Anos, que ocorreu esta manh� na capital paulista", "Jornal do Brasil", "http://www.jb.com.br/economia/noticias/2013/12/02/brasil-crescera-4-ao-ano-ate-2022/"));
			add(new News("Brasil: expectativa de vida chega a 74,6 anos", "A expectativa de vida ao nascer no Brasil chegou a 74,6 anos em 2012", "A expectativa de vida ao nascer no Brasil chegou a 74,6 anos em 2012, segundo dados divulgados hoje pelo IBGE (Instituto Brasileiro de Geografia e Estat�stica) no Di�rio Oficial da Uni�o. Em 2011, a expectativa de vida era de 74,08 anos.", "Correio do Estado", "http://www.correiodoestado.com.br/noticias/brasil-expectativa-de-vida-chega-a-74-6-anos_201110/"));
			add(new News("Amazon est� testando entrega com drones, diz CEO", "A Amazon.com est� testando pacotes de entrega usando drones", "A Amazon.com est� testando pacotes de entrega usando drones, disse neste domingo o presidente-executivo, Jeff Bezos, no programa de televis�o 60 Minutes da CBS.Bezos disse que os drones, ve�culos a�reos n�o-tripulados, podem entregar pacotes com peso de at� 5 libras (2,3 kg). Isso representa cerca de 86 por cento dos pacotes que a Amazon entrega, segundo informou Bezos no domingo.", "Terra", "http://tecnologia.terra.com.br/amazon-esta-testando-entrega-com-drones-diz-ceo,ed42e12eba4a2410VgnCLD2000000ec6eb0aRCRD.html"));
			add(new News("Síria: Activistas elevam para mais de 125 mil n�mero de mortos", "Pelo menos 125.835 pessoas, entra as quais 6.625 menores, morreram na S�ria desde o in�cio do conflito no pa�s", "Pelo menos 125.835 pessoas, entra as quais 6.625 menores, morreram na S�ria desde o in�cio do conflito no pa�s, h� dois anos e meio, indicou hoje o Observat�rio S�rio de Direitos Humanos.O grupo, com sede em Londres e uma ampla rede de activistas no pa�s �rabe, explicou que contabilizou as v�timas desde o in�cio da revolta contra o presidente Bashar al Assad, a 18 de Mar�o de 2011,  at� 1 de Dezembro.", "Diario Digital", "http://diariodigital.sapo.pt/news.asp?id_news=672065"));
			add(new News("Pol�cia investiga se carro com Paul Walker participava de 'racha", "A pol�cia de Los Angeles investiga a possibilidade de que o carro ocupado pelo ator Paul Walker participava de um racha ", "A pol�cia de Los Angeles investiga a possibilidade de que o carro ocupado pelo ator Paul Walker participava de um racha pouco antes do acidente que, neste s�bado (30), terminou com a morte do ator, conhecido pela franquia Velozes e furiosos.", "Globo.com", "http://g1.globo.com/pop-arte/cinema/noticia/2013/12/policia-investiga-se-carro-com-paul-walker-participava-de-racha-diz-site.html"));
			add(new News("Barbosa � rejeitado por partidos pol�ticos", "O Ministro Joaquim Barbosa, presidente do Supremo Tribunal Federal, vem desempenhando seu trabalho com muita compet�ncia. Barbosa foi implac�vel no julgamento da A��o Penal 470", "O Ministro Joaquim Barbosa, presidente do Supremo Tribunal Federal, vem desempenhando seu trabalho com muita compet�ncia. Barbosa foi implac�vel no julgamento da A��o Penal 470, o processo do mensal�o, que culminou na condena��o e pris�o de pol�ticos. Barbosa � motivo de orgulho para os brasileiros, e muitos at� gostariam de v�-lo como presidente do Brasil. ", "Momento Verdadeiro", "http://www.momentoverdadeiro.com/2013/12/barbosa-nao-e-bem-vindo-no-pr-nao-deus-me-livre.html"));
			add(new News("Rumores sobre o Galaxy S5 surgem na web", "Samsung Galaxy S5 dever� ser lan�ado em mar�o do pr�ximo ano, diz site sul coreano.", "Samsung Galaxy S5 dever� ser lan�ado em mar�o do pr�ximo ano, diz site sul coreano. Rumores recentes dizem que sucessor do Galaxy S4, da Samsung, dever� ser lan�ado no primeiro trimestre do pr�ximo ano. De acordo com o site sul coreano de tecnologia ETnews, que afirma ter conseguido informa��es de dentro da companhia, diz que o novo aparelho dever� come�ar a ser fabricado em 20  janeiro de 2014.", "Oficina da Net", "http://www.oficinadanet.com.br/post/12039-rumores-sobre-o-galaxy-s5-surgem-na-web"));
			add(new News("'Cinquenta Tons de Cinza' vai ganhar vers�o especial para maiores", "Ao que tudo indica, os produtores de Cinquenta Tons de Cinza pretendem fazer duas vers�es do filme", "Ao que tudo indica, os produtores de Cinquenta Tons de Cinza pretendem fazer duas vers�es do filme. Os respons�veis pelo longa, que conta as aventuras sexuais de um amante sadomasoquista milion�rio, Christian Grey (Jamie Dornan), e sua parceira virginal Anastasia Steele (Dakota Johnson), v�o fazer uma vers�o para maiores do filme, que ser� exibido em cinemas com licen�a especial, e uma op��o mais leve. ", "Cinema Terra", "http://cinema.terra.com.br/cinquenta-tons-de-cinza-vai-ganhar-versao-especial-para-maiores,3b5eabfc673b2410VgnVCM4000009bcceb0aRCRD.html"));
			add(new News("Site vende a homens avalia��o positiva no app Lulu por at� R$ 100", "O Lulu gerou como��o entre as mulheres, deixou homens incomodados, a ponto de um estudante acionar o aplicativo na Justi�a, e agora virou neg�cio.", "O Lulu gerou como��o entre as mulheres, deixou homens incomodados, a ponto de um estudante acionar o aplicativo na Justi�a, e agora virou neg�cio. Criado nesta quinta-feira (28), o site LuluFake vende pacotes de avalia��es positivas, que v�o de R$ 10 a R$ 100, para melhorar a nota final de rapazes no aplicativo que incentiva mulheres a classificar desempenho e comportamento masculinos", "180 graus", "http://180graus.com/noticias/site-vende-a-homens-avaliacao-positiva-no-app-lulu-por-ate-r-100"));
			add(new News("Dilma anuncia novas bolsas de estudos para mestrados no exterior", "A presidente Dilma Rousseff anunciou que a partir desta segunda-feira o governo oferecer� bolsas de estudos para mestrados em universidades do exterior, no marco do programa Ci�ncias sem Fronteiras, que busca melhorar a forma��o t�cnica dos profissionais.", "A presidente Dilma Rousseff anunciou que a partir desta segunda-feira o governo oferecer� bolsas de estudos para mestrados em universidades do exterior, no marco do programa Ci�ncias sem Fronteiras, que busca melhorar a forma��o t�cnica dos profissionais. Essas mestrados s�o perfeitos para quem j� terminou o curso superior e precisa desenvolver e aperfei�ar seus conhecimentos para aplic�-los em sua vida profissional, declarou a presidente em seu programa de r�dio semanal, que � transmitido toda segunda-feira.", "Noticias Terra", "http://noticias.terra.com.br/educacao/dilma-anuncia-novas-bolsas-de-estudos-para-mestrados-no-exterior,7ef1e12eba4a2410VgnCLD2000000ec6eb0aRCRD.html"));
		}
	};
	
	
	public static FakeDb connect(){
		if(mFakeDb == null){
			mFakeDb = new FakeDb();
		}
		return mFakeDb;
	}
	
	public ArrayList<News> loadAll(){
		return sNews;
	}
	
	public News load(int id){
		return sNews.get(id);
	}
	
	
	
	
	
	
	
}

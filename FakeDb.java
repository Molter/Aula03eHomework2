package br.com.gabrielmolter.listviewdemos;

import java.util.ArrayList;

public class FakeDb {
	
	private static FakeDb mFakeDb;
	
	private static ArrayList<News> sNews = new ArrayList<News>(){
		{
			add(new News("header", "colapsed", "expanded", "source", "link"));
			add(new News("Brasil crescerá 4% ao ano até 2022", "São Paulo – O Ministro da Fazenda, Guido Mantega", "São Paulo – O Ministro da Fazenda, Guido Mantega, projetou que o Brasil deve registrar um crescimento no Produto Interno Bruto (PIB) de, em média, 4% ao ano, a partir de 2014 até 2022. “Não é um grande salto, é bastante realista, eu diria até que modesto. É suficiente para aumentar a renda per capita”, declarou durante o Seminário Brasil: Uma Visão de Dez Anos, que ocorreu esta manhã na capital paulista", "Jornal do Brasil", "http://www.jb.com.br/economia/noticias/2013/12/02/brasil-crescera-4-ao-ano-ate-2022/"));
			add(new News("Brasil: expectativa de vida chega a 74,6 anos", "A expectativa de vida ao nascer no Brasil chegou a 74,6 anos em 2012", "A expectativa de vida ao nascer no Brasil chegou a 74,6 anos em 2012, segundo dados divulgados hoje pelo IBGE (Instituto Brasileiro de Geografia e Estatística) no Diário Oficial da União. Em 2011, a expectativa de vida era de 74,08 anos.", "Correio do Estado", "http://www.correiodoestado.com.br/noticias/brasil-expectativa-de-vida-chega-a-74-6-anos_201110/"));
			add(new News("Amazon está testando entrega com drones, diz CEO", "A Amazon.com está testando pacotes de entrega usando drones", "A Amazon.com está testando pacotes de entrega usando drones, disse neste domingo o presidente-executivo, Jeff Bezos, no programa de televisão 60 Minutes da CBS.Bezos disse que os drones, veículos aéreos não-tripulados, podem entregar pacotes com peso de até 5 libras (2,3 kg). Isso representa cerca de 86 por cento dos pacotes que a Amazon entrega, segundo informou Bezos no domingo.", "Terra", "http://tecnologia.terra.com.br/amazon-esta-testando-entrega-com-drones-diz-ceo,ed42e12eba4a2410VgnCLD2000000ec6eb0aRCRD.html"));
			add(new News("Síria: Activistas elevam para mais de 125 mil número de mortos", "Pelo menos 125.835 pessoas, entra as quais 6.625 menores, morreram na Síria desde o início do conflito no país", "Pelo menos 125.835 pessoas, entra as quais 6.625 menores, morreram na Síria desde o início do conflito no país, há dois anos e meio, indicou hoje o Observatório Sírio de Direitos Humanos.O grupo, com sede em Londres e uma ampla rede de activistas no país árabe, explicou que contabilizou as vítimas desde o início da revolta contra o presidente Bashar al Assad, a 18 de Março de 2011,  até 1 de Dezembro.", "Diario Digital", "http://diariodigital.sapo.pt/news.asp?id_news=672065"));
			add(new News("Polícia investiga se carro com Paul Walker participava de 'racha", "A polícia de Los Angeles investiga a possibilidade de que o carro ocupado pelo ator Paul Walker participava de um racha ", "A polícia de Los Angeles investiga a possibilidade de que o carro ocupado pelo ator Paul Walker participava de um racha pouco antes do acidente que, neste sábado (30), terminou com a morte do ator, conhecido pela franquia Velozes e furiosos.", "Globo.com", "http://g1.globo.com/pop-arte/cinema/noticia/2013/12/policia-investiga-se-carro-com-paul-walker-participava-de-racha-diz-site.html"));
			add(new News("Barbosa é rejeitado por partidos políticos", "O Ministro Joaquim Barbosa, presidente do Supremo Tribunal Federal, vem desempenhando seu trabalho com muita competência. Barbosa foi implacável no julgamento da Ação Penal 470", "O Ministro Joaquim Barbosa, presidente do Supremo Tribunal Federal, vem desempenhando seu trabalho com muita competência. Barbosa foi implacável no julgamento da Ação Penal 470, o processo do mensalão, que culminou na condenação e prisão de políticos. Barbosa é motivo de orgulho para os brasileiros, e muitos até gostariam de vê-lo como presidente do Brasil. ", "Momento Verdadeiro", "http://www.momentoverdadeiro.com/2013/12/barbosa-nao-e-bem-vindo-no-pr-nao-deus-me-livre.html"));
			add(new News("Rumores sobre o Galaxy S5 surgem na web", "Samsung Galaxy S5 deverá ser lançado em março do próximo ano, diz site sul coreano.", "Samsung Galaxy S5 deverá ser lançado em março do próximo ano, diz site sul coreano. Rumores recentes dizem que sucessor do Galaxy S4, da Samsung, deverá ser lançado no primeiro trimestre do próximo ano. De acordo com o site sul coreano de tecnologia ETnews, que afirma ter conseguido informações de dentro da companhia, diz que o novo aparelho deverá começar a ser fabricado em 20  janeiro de 2014.", "Oficina da Net", "http://www.oficinadanet.com.br/post/12039-rumores-sobre-o-galaxy-s5-surgem-na-web"));
			add(new News("'Cinquenta Tons de Cinza' vai ganhar versão especial para maiores", "Ao que tudo indica, os produtores de Cinquenta Tons de Cinza pretendem fazer duas versões do filme", "Ao que tudo indica, os produtores de Cinquenta Tons de Cinza pretendem fazer duas versões do filme. Os responsáveis pelo longa, que conta as aventuras sexuais de um amante sadomasoquista milionário, Christian Grey (Jamie Dornan), e sua parceira virginal Anastasia Steele (Dakota Johnson), vão fazer uma versão para maiores do filme, que será exibido em cinemas com licença especial, e uma opção mais leve. ", "Cinema Terra", "http://cinema.terra.com.br/cinquenta-tons-de-cinza-vai-ganhar-versao-especial-para-maiores,3b5eabfc673b2410VgnVCM4000009bcceb0aRCRD.html"));
			add(new News("Site vende a homens avaliação positiva no app Lulu por até R$ 100", "O Lulu gerou comoção entre as mulheres, deixou homens incomodados, a ponto de um estudante acionar o aplicativo na Justiça, e agora virou negócio.", "O Lulu gerou comoção entre as mulheres, deixou homens incomodados, a ponto de um estudante acionar o aplicativo na Justiça, e agora virou negócio. Criado nesta quinta-feira (28), o site LuluFake vende pacotes de avaliações positivas, que vão de R$ 10 a R$ 100, para melhorar a nota final de rapazes no aplicativo que incentiva mulheres a classificar desempenho e comportamento masculinos", "180 graus", "http://180graus.com/noticias/site-vende-a-homens-avaliacao-positiva-no-app-lulu-por-ate-r-100"));
			add(new News("Dilma anuncia novas bolsas de estudos para mestrados no exterior", "A presidente Dilma Rousseff anunciou que a partir desta segunda-feira o governo oferecerá bolsas de estudos para mestrados em universidades do exterior, no marco do programa Ciências sem Fronteiras, que busca melhorar a formação técnica dos profissionais.", "A presidente Dilma Rousseff anunciou que a partir desta segunda-feira o governo oferecerá bolsas de estudos para mestrados em universidades do exterior, no marco do programa Ciências sem Fronteiras, que busca melhorar a formação técnica dos profissionais. Essas mestrados são perfeitos para quem já terminou o curso superior e precisa desenvolver e aperfeiçar seus conhecimentos para aplicá-los em sua vida profissional, declarou a presidente em seu programa de rádio semanal, que é transmitido toda segunda-feira.", "Noticias Terra", "http://noticias.terra.com.br/educacao/dilma-anuncia-novas-bolsas-de-estudos-para-mestrados-no-exterior,7ef1e12eba4a2410VgnCLD2000000ec6eb0aRCRD.html"));
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

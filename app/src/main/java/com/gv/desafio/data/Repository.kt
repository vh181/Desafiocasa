package com.gv.desafio.data

data class Repository(
        val userName_Repository: String,
        val surName_Repository: String,
        val repositoryName_Repository: String,
        val repositoryText_Repository: String,
        val starIcon_Repository: Boolean,
        val gitIcon_Repository: Boolean,
        val numberGit_Repository: String,
        val numberStar_Repository: String,
        val imageIcon_Repository: Boolean)


class RepositoryBuilder {
    var userName_Repository: String = ""
    var surName_Repository: String = ""
    var repositoryName_Repository: String = ""
    var repositoryText_Repository: String = ""
    var starIcon_Repository: Boolean = false
    var gitIcon_Repository: Boolean = false
    var numberGit_Repository: String = ""
    var numberStar_Repository: String = ""
    var imageIcon_Repository: Boolean = true

    fun build(): Repository = Repository(userName_Repository, surName_Repository,repositoryName_Repository,  repositoryText_Repository, starIcon_Repository, gitIcon_Repository, numberGit_Repository, numberStar_Repository, imageIcon_Repository)

}

fun repository(block: RepositoryBuilder.() -> Unit): Repository = RepositoryBuilder().apply(block).build()

fun fakeRepository(): MutableList<Repository> = mutableListOf(
        repository {
            userName_Repository = "Victor Hugo"
            surName_Repository = "Andrade Diniz de Araujo"
            repositoryName_Repository = "Desafio do carlos"
            repositoryText_Repository = " Licença Padrão ENAP::É permitida a reprodução e a exibição para uso educacional ou informativo, desde que respeitado o crédito ao autor original e citada a fonte (http://www.enap.gov.br). Permitida a inclusão da obra em Repositórios ou Portais de Acesso Aberto, desde que fique claro para os usuários esses “termos de uso”"
            starIcon_Repository = true
            gitIcon_Repository = true
            imageIcon_Repository = true
            numberGit_Repository = "55"
            numberStar_Repository = "99"

        },
        repository {
            userName_Repository = "Amanda"
            surName_Repository = "Andrade Diniz de Araujo"
            repositoryName_Repository = "Carlos"
            repositoryText_Repository = " Descreve foro imaginário onde são apontados diversos aspectos da discussão de um projeto de informação para um país fictício no início do século XXI. Por meio do discurso dos personagens, apresenta a pluralidade de conceitos que caracteriza esse debate: da difusão do conhecimento científico-tecnológico à ampla disponibilização de informações de interesse dos diversos segmentos da sociedade civil."
            starIcon_Repository = true
            gitIcon_Repository = true
            imageIcon_Repository = true
            numberGit_Repository = "99"
            numberStar_Repository = "199"

        },
        repository {
            userName_Repository = "Ana Carla"
            surName_Repository = "Andrade Diniz de Araujo"
            repositoryName_Repository = "Desafio"
            repositoryText_Repository = "Describe el foro imaginario donde son senalados diversos aspectos de la discusión de un proyecto de información para un país ficticio a principios del siglo XXI. A través dei discurso de los personajes, prescnta la pluralidad de conceptos que caracteriza ese debate: de la difusión del conocimiento científicotecnológico a la amplia disponibilidad de informaciones de interés de los diversos segmentos de la sociedad civil. "
            starIcon_Repository = true
            gitIcon_Repository = true
            imageIcon_Repository = true
            numberGit_Repository = "75"
            numberStar_Repository = "129"

        },
        repository {
            userName_Repository = "Cleber"
            surName_Repository = "Andrade Diniz de Araujo"
            repositoryName_Repository = "Estudo"
            repositoryText_Repository = "A leitura e a escrita como práticas sociais envolvem processos discursivos e cognitivos. Por isso, toma-se a leitura como um momento uma ação de produção de sentidos em atividade de interlocução e compreensão responsiva. Assim como observa-se a escrita como um processo de interlocução e de interação social. Uma leitura significativa subsidia significativamente uma nova escrita, dado o movimento de escrita está arrolado na retextualização da leitura. Concebe-se, assim, a retextualização como um processo de produção textual significativa, no qual mobiliza funções linguísti"
            starIcon_Repository = true
            gitIcon_Repository = true
            imageIcon_Repository = true
            numberGit_Repository = "155"
            numberStar_Repository = "299"

        },
        repository {
            userName_Repository = "Pipoca"
            surName_Repository = "Andrade Diniz de Araujo"
            repositoryName_Repository = "Comida"
            repositoryText_Repository = "ritings. In this way, this work supports new writing so helpful to let the pupils develop the retextualization process , used as a practice of reading and writing which mobilize linguistic cognitive function and textual linguistic and disc"
            starIcon_Repository = true
            gitIcon_Repository = true
            imageIcon_Repository = true
            numberGit_Repository = "355"
            numberStar_Repository = "49"

        },
        repository {
            userName_Repository = "Carlos"
            surName_Repository = "Gente Fina"
            repositoryName_Repository = "Loucura"
            repositoryText_Repository = " Licença Padrão ENAP::É permitida a reprodução e a exibição para uso educacional ou informativo, desde que respeitado o crédito ao autor original e citada a fonte (http://www.enap.gov.br). Permitida a inclusão da obra em Repositórios ou Portais de Acesso Aberto, desde que fique claro para os usuários esses “termos de uso”"
            starIcon_Repository = true
            gitIcon_Repository = true
            imageIcon_Repository = true
            numberGit_Repository = "200"
            numberStar_Repository = "200"

        },
        repository {
            userName_Repository = "Bruno"
            surName_Repository = "Araujo"
            repositoryName_Repository = "Pratos de Comida"
            repositoryText_Repository = " Licença Padrão ENAP::É permitida a reprodução e a exibição para uso educacional ou informativo, desde que respeitado o crédito ao autor original e citada a fonte (http://www.enap.gov.br). Permitida a inclusão da obra em Repositórios ou Portais de Acesso Aberto, desde que fique claro para os usuários esses “termos de uso”"
            starIcon_Repository = true
            gitIcon_Repository = true
            imageIcon_Repository = true
            numberGit_Repository = "350"
            numberStar_Repository = "599"

        },
        repository {
            userName_Repository = "Jerson"
            surName_Repository = "Diniz"
            repositoryName_Repository = "Eletricidade"
            repositoryText_Repository = " Licença Padrão ENAP::É permitida a reprodução e a exibição para uso educacional ou informativo, desde que respeitado o crédito ao autor original e citada a fonte (http://www.enap.gov.br). Permitida a inclusão da obra em Repositórios ou Portais de Acesso Aberto, desde que fique claro para os usuários esses “termos de uso”"
            starIcon_Repository = true
            gitIcon_Repository = true
            imageIcon_Repository = true
            numberGit_Repository = "60"
            numberStar_Repository = "37"

        },
        repository {
            userName_Repository = "Kaio"
            surName_Repository = "Araujo"
            repositoryName_Repository = "Desafio do carlos"
            repositoryText_Repository = " Licença Padrão ENAP::É permitida a reprodução e a exibição para uso educacional ou informativo, desde que respeitado o crédito ao autor original e citada a fonte (http://www.enap.gov.br). Permitida a inclusão da obra em Repositórios ou Portais de Acesso Aberto, desde que fique claro para os usuários esses “termos de uso”"
            starIcon_Repository = true
            gitIcon_Repository = true
            imageIcon_Repository = true
            numberGit_Repository = "55"
            numberStar_Repository = "99"

        }


)
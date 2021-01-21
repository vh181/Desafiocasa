package com.gv.desafio.data

data class Repository(
        val userName_Repository: String,
        val sobreName_Repository: String,
        val repositorioName_Repository: String,
        val repositorioText_Repository: String,
        val starIcon_Repository: Boolean,
        val gitIcon_Repository: Boolean,
        val numeroGit_Repository: String,
        val numeroStar_Repository: String,
        val imagemgIcon_Repository: Boolean)


class RepositoryBuilder {
    var userName_Repository: String = ""
    var sobreName_Repository: String = ""
    var repositorioName_Repository: String = ""
    var repositorioText_Repository: String = ""
    var starIcon_Repository: Boolean = false
    var gitIcon_Repository: Boolean = false
    var numeroGit_Repository: String = ""
    var numeroStar_Repository: String = ""
    var imagemIcon_Repository: Boolean = true

    fun build(): Repository = Repository(userName_Repository, sobreName_Repository,repositorioName_Repository,  repositorioText_Repository, starIcon_Repository, gitIcon_Repository, numeroGit_Repository, numeroStar_Repository, imagemIcon_Repository)

}

fun git(block: GitBuilder.() -> Unit): Git = GitBuilder().apply(block).build()

fun fakeGit(): MutableList<Git> = mutableListOf(
        git {
            userName_Git = "Victor Hugo"
            sobreName_Git = "Andrade Diniz de Araujo"
            repositorioName_Git = "Desafio do carlos"
            repositorioText_Git = " Licença Padrão ENAP::É permitida a reprodução e a exibição para uso educacional ou informativo, desde que respeitado o crédito ao autor original e citada a fonte (http://www.enap.gov.br). Permitida a inclusão da obra em Repositórios ou Portais de Acesso Aberto, desde que fique claro para os usuários esses “termos de uso”"
            starIcon_Git = true
            gitIcon_Git = true
            imagemIcon_Git = true
            numeroGit_Git = "55"
            numeroStar_Git = "99"

        },
        git {
            userName_Git = "Amanda"
            sobreName_Git = "Andrade Diniz de Araujo"
            repositorioName_Git = "Carlos"
            repositorioText_Git = " Descreve foro imaginário onde são apontados diversos aspectos da discussão de um projeto de informação para um país fictício no início do século XXI. Por meio do discurso dos personagens, apresenta a pluralidade de conceitos que caracteriza esse debate: da difusão do conhecimento científico-tecnológico à ampla disponibilização de informações de interesse dos diversos segmentos da sociedade civil."
            starIcon_Git = true
            gitIcon_Git = true
            imagemIcon_Git = true
            numeroGit_Git = "99"
            numeroStar_Git = "199"

        },
        git {
            userName_Git = "Ana Carla"
            sobreName_Git = "Andrade Diniz de Araujo"
            repositorioName_Git = "Desafio"
            repositorioText_Git = "Describe el foro imaginario donde son senalados diversos aspectos de la discusión de un proyecto de información para un país ficticio a principios del siglo XXI. A través dei discurso de los personajes, prescnta la pluralidad de conceptos que caracteriza ese debate: de la difusión del conocimiento científicotecnológico a la amplia disponibilidad de informaciones de interés de los diversos segmentos de la sociedad civil. "
            starIcon_Git = true
            gitIcon_Git = true
            imagemIcon_Git = true
            numeroGit_Git = "75"
            numeroStar_Git = "129"

        },
        git {
            userName_Git = "Cleber"
            sobreName_Git = "Andrade Diniz de Araujo"
            repositorioName_Git = "Estudo"
            repositorioText_Git = "A leitura e a escrita como práticas sociais envolvem processos discursivos e cognitivos. Por isso, toma-se a leitura como um momento uma ação de produção de sentidos em atividade de interlocução e compreensão responsiva. Assim como observa-se a escrita como um processo de interlocução e de interação social. Uma leitura significativa subsidia significativamente uma nova escrita, dado o movimento de escrita está arrolado na retextualização da leitura. Concebe-se, assim, a retextualização como um processo de produção textual significativa, no qual mobiliza funções linguísti"
            starIcon_Git = true
            gitIcon_Git = true
            imagemIcon_Git = true
            numeroGit_Git = "155"
            numeroStar_Git = "299"

        },
        git {
            userName_Git = "Pipoca"
            sobreName_Git = "Andrade Diniz de Araujo"
            repositorioName_Git = "Comida"
            repositorioText_Git = "ritings. In this way, this work supports new writing so helpful to let the pupils develop the retextualization process , used as a practice of reading and writing which mobilize linguistic cognitive function and textual linguistic and disc"
            starIcon_Git = true
            gitIcon_Git = true
            imagemIcon_Git = true
            numeroGit_Git = "355"
            numeroStar_Git = "49"

        },
        git {
            userName_Git = "Carlos"
            sobreName_Git = "Gente Fina"
            repositorioName_Git = "Loucura"
            repositorioText_Git = " Licença Padrão ENAP::É permitida a reprodução e a exibição para uso educacional ou informativo, desde que respeitado o crédito ao autor original e citada a fonte (http://www.enap.gov.br). Permitida a inclusão da obra em Repositórios ou Portais de Acesso Aberto, desde que fique claro para os usuários esses “termos de uso”"
            starIcon_Git = true
            gitIcon_Git = true
            imagemIcon_Git = true
            numeroGit_Git = "200"
            numeroStar_Git = "200"

        },
        git {
            userName_Git = "Bruno"
            sobreName_Git = "Araujo"
            repositorioName_Git = "Pratos de Comida"
            repositorioText_Git = " Licença Padrão ENAP::É permitida a reprodução e a exibição para uso educacional ou informativo, desde que respeitado o crédito ao autor original e citada a fonte (http://www.enap.gov.br). Permitida a inclusão da obra em Repositórios ou Portais de Acesso Aberto, desde que fique claro para os usuários esses “termos de uso”"
            starIcon_Git = true
            gitIcon_Git = true
            imagemIcon_Git = true
            numeroGit_Git = "350"
            numeroStar_Git = "599"

        },
        git {
            userName_Git = "Jerson"
            sobreName_Git = "Diniz"
            repositorioName_Git = "Eletricidade"
            repositorioText_Git = " Licença Padrão ENAP::É permitida a reprodução e a exibição para uso educacional ou informativo, desde que respeitado o crédito ao autor original e citada a fonte (http://www.enap.gov.br). Permitida a inclusão da obra em Repositórios ou Portais de Acesso Aberto, desde que fique claro para os usuários esses “termos de uso”"
            starIcon_Git = true
            gitIcon_Git = true
            imagemIcon_Git = true
            numeroGit_Git = "60"
            numeroStar_Git = "37"

        },
        git {
            userName_Git = "Kaio"
            sobreName_Git = "Araujo"
            repositorioName_Git = "Desafio do carlos"
            repositorioText_Git = " Licença Padrão ENAP::É permitida a reprodução e a exibição para uso educacional ou informativo, desde que respeitado o crédito ao autor original e citada a fonte (http://www.enap.gov.br). Permitida a inclusão da obra em Repositórios ou Portais de Acesso Aberto, desde que fique claro para os usuários esses “termos de uso”"
            starIcon_Git = true
            gitIcon_Git = true
            imagemIcon_Git = true
            numeroGit_Git = "55"
            numeroStar_Git = "99"

        }


)
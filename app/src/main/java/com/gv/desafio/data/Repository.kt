package com.gv.desafio.data

data class Repository(
        val userNameRepository: String,
        val surNameRepository: String,
        val repositoryNameRepository: String,
        val repositoryTextRepository: String,
        val starIconRepository: Boolean,
        val gitIconRepository: Boolean,
        val numberGitRepository: String,
        val numberStarRepository: String,
        val imageIconRepository: Boolean)


class RepositoryBuilder {
    var userNameRepository: String = ""
    var surNameRepository: String = ""
    var repositoryNameRepository: String = ""
    var repositoryTextRepository: String = ""
    var starIconRepository: Boolean = false
    var gitIconRepository: Boolean = false
    var numberGitRepository: String = ""
    var numberStarRepository: String = ""
    var imageIconRepository: Boolean = true

    fun build(): Repository = Repository(userNameRepository, surNameRepository, repositoryNameRepository, repositoryTextRepository, starIconRepository, gitIconRepository, numberGitRepository, numberStarRepository, imageIconRepository)

}

fun repository(block: RepositoryBuilder.() -> Unit): Repository = RepositoryBuilder().apply(block).build()

fun fakeRepository(): MutableList<Repository> = mutableListOf(
        repository {
            userNameRepository = "Victor Hugo"
            surNameRepository = "Andrade Diniz de Araujo"
            repositoryNameRepository = "Desafio do carlos"
            repositoryTextRepository = "Licença Padrão ENAP::É permitida a reprodução e a exibição para uso educacional ou informativo, desde que respeitado o crédito ao autor original e citada a fonte (http://www.enap.gov.br). Permitida a inclusão da obra em Repositórios ou Portais de Acesso Aberto, desde que fique claro para os usuários esses “termos de uso”"
            starIconRepository = true
            gitIconRepository = true
            imageIconRepository = true
            numberGitRepository = "55"
            numberStarRepository = "99"

        },
        repository {
            userNameRepository = "Amanda"
            surNameRepository = "Andrade Diniz de Araujo"
            repositoryNameRepository = "Carlos"
            repositoryTextRepository = "Descreve foro imaginário onde são apontados diversos aspectos da discussão de um projeto de informação para um país fictício no início do século XXI. Por meio do discurso dos personagens, apresenta a pluralidade de conceitos que caracteriza esse debate: da difusão do conhecimento científico-tecnológico à ampla disponibilização de informações de interesse dos diversos segmentos da sociedade civil."
            starIconRepository = true
            gitIconRepository = true
            imageIconRepository = true
            numberGitRepository = "99"
            numberStarRepository = "199"

        },
        repository {
            userNameRepository = "Ana Carla"
            surNameRepository = "Andrade Diniz de Araujo"
            repositoryNameRepository = "Desafio"
            repositoryTextRepository = "Describe el foro imaginario donde son senalados diversos aspectos de la discusión de un proyecto de información para un país ficticio a principios del siglo XXI. A través dei discurso de los personajes, prescnta la pluralidad de conceptos que caracteriza ese debate: de la difusión del conocimiento científicotecnológico a la amplia disponibilidad de informaciones de interés de los diversos segmentos de la sociedad civil. "
            starIconRepository = true
            gitIconRepository = true
            imageIconRepository = true
            numberGitRepository = "75"
            numberStarRepository = "129"

        },
        repository {
            userNameRepository = "Cleber"
            surNameRepository = "Andrade Diniz de Araujo"
            repositoryNameRepository = "Estudo"
            repositoryTextRepository = "A leitura e a escrita como práticas sociais envolvem processos discursivos e cognitivos. Por isso, toma-se a leitura como um momento uma ação de produção de sentidos em atividade de interlocução e compreensão responsiva. Assim como observa-se a escrita como um processo de interlocução e de interação social. Uma leitura significativa subsidia significativamente uma nova escrita, dado o movimento de escrita está arrolado na retextualização da leitura. Concebe-se, assim, a retextualização como um processo de produção textual significativa, no qual mobiliza funções linguísti"
            starIconRepository = true
            gitIconRepository = true
            imageIconRepository = true
            numberGitRepository = "155"
            numberStarRepository = "299"

        },
        repository {
            userNameRepository = "Pipoca"
            surNameRepository = "Andrade Diniz de Araujo"
            repositoryNameRepository = "Comida"
            repositoryTextRepository = "ritings. In this way, this work supports new writing so helpful to let the pupils develop the retextualization process , used as a practice of reading and writing which mobilize linguistic cognitive function and textual linguistic and disc"
            starIconRepository = true
            gitIconRepository = true
            imageIconRepository = true
            numberGitRepository = "355"
            numberStarRepository = "49"

        },
        repository {
            userNameRepository = "Carlos"
            surNameRepository = "Gente Fina"
            repositoryNameRepository = "Loucura"
            repositoryTextRepository = "Licença Padrão ENAP::É permitida a reprodução e a exibição para uso educacional ou informativo, desde que respeitado o crédito ao autor original e citada a fonte (http://www.enap.gov.br). Permitida a inclusão da obra em Repositórios ou Portais de Acesso Aberto, desde que fique claro para os usuários esses “termos de uso”"
            starIconRepository = true
            gitIconRepository = true
            imageIconRepository = true
            numberGitRepository = "200"
            numberStarRepository = "200"

        },
        repository {
            userNameRepository = "Bruno"
            surNameRepository = "Araujo"
            repositoryNameRepository = "Pratos de Comida"
            repositoryTextRepository = "Licença Padrão ENAP::É permitida a reprodução e a exibição para uso educacional ou informativo, desde que respeitado o crédito ao autor original e citada a fonte (http://www.enap.gov.br). Permitida a inclusão da obra em Repositórios ou Portais de Acesso Aberto, desde que fique claro para os usuários esses “termos de uso”"
            starIconRepository = true
            gitIconRepository = true
            imageIconRepository = true
            numberGitRepository = "350"
            numberStarRepository = "599"

        },
        repository {
            userNameRepository = "Jerson"
            surNameRepository = "Diniz"
            repositoryNameRepository = "Eletricidade"
            repositoryTextRepository = "Licença Padrão ENAP::É permitida a reprodução e a exibição para uso educacional ou informativo, desde que respeitado o crédito ao autor original e citada a fonte (http://www.enap.gov.br). Permitida a inclusão da obra em Repositórios ou Portais de Acesso Aberto, desde que fique claro para os usuários esses “termos de uso”"
            starIconRepository = true
            gitIconRepository = true
            imageIconRepository = true
            numberGitRepository = "60"
            numberStarRepository = "37"

        },
        repository {
            userNameRepository = "Kaio"
            surNameRepository = "Araujo"
            repositoryNameRepository = "Desafio do carlos"
            repositoryTextRepository = "Licença Padrão ENAP::É permitida a reprodução e a exibição para uso educacional ou informativo, desde que respeitado o crédito ao autor original e citada a fonte (http://www.enap.gov.br). Permitida a inclusão da obra em Repositórios ou Portais de Acesso Aberto, desde que fique claro para os usuários esses “termos de uso”"
            starIconRepository = true
            gitIconRepository = true
            imageIconRepository = true
            numberGitRepository = "55"
            numberStarRepository = "99"

        }


)
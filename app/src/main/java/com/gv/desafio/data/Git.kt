package com.gv.desafio.data

data class Git (
        val user_name : String,
        val sobre_name: String,
        val reposi_name: String,
        val repsoi_text: String,
        val star_icon: Boolean,
        val git_icon: Boolean,
        val n_git: String,
        val n_star: String,
        val img_icon: Boolean)


class GitBuilder{
    var user_name : String=""
    var sobre_name: String=""
    var reposi_name: String=""
    var repsoi_text: String=""
    var star_icon: Boolean=false
    var git_icon: Boolean=false
    var n_git: String=""
    var n_star: String=""
    var img_icon: Boolean=true

    fun build() : Git= Git(user_name, sobre_name, reposi_name, repsoi_text, star_icon, git_icon, n_git, n_star, img_icon)

}

fun git(block: GitBuilder.()-> Unit): Git=GitBuilder().apply(block).build()

fun fakeGit():MutableList<Git> = mutableListOf(
        git {
            user_name =" Victor Hugo"
            sobre_name=" Andrade Diniz de Araujo"
            reposi_name="Desafio do carlos"
            repsoi_text=" Licença Padrão ENAP::É permitida a reprodução e a exibição para uso educacional ou informativo, desde que respeitado o crédito ao autor original e citada a fonte (http://www.enap.gov.br). Permitida a inclusão da obra em Repositórios ou Portais de Acesso Aberto, desde que fique claro para os usuários esses “termos de uso”"
            star_icon=true
            git_icon=true
            img_icon=true
            n_git="55"
            n_star="99"

        },
        git {
            user_name =" Amanda"
            sobre_name=" Andrade Diniz de Araujo"
            reposi_name="Carlos"
            repsoi_text=" Descreve foro imaginário onde são apontados diversos aspectos da discussão de um projeto de informação para um país fictício no início do século XXI. Por meio do discurso dos personagens, apresenta a pluralidade de conceitos que caracteriza esse debate: da difusão do conhecimento científico-tecnológico à ampla disponibilização de informações de interesse dos diversos segmentos da sociedade civil."
            star_icon=true
            git_icon=true
            img_icon=true
            n_git="99"
            n_star="199"

        },
        git {
            user_name ="Ana Carla"
            sobre_name=" Andrade Diniz de Araujo"
            reposi_name="Desafio"
            repsoi_text="Describe el foro imaginario donde son senalados diversos aspectos de la discusión de un proyecto de información para un país ficticio a principios del siglo XXI. A través dei discurso de los personajes, prescnta la pluralidad de conceptos que caracteriza ese debate: de la difusión del conocimiento científicotecnológico a la amplia disponibilidad de informaciones de interés de los diversos segmentos de la sociedad civil. "
            star_icon=true
            git_icon=true
            img_icon=true
            n_git="75"
            n_star="129"

        },
        git {
            user_name ="Cleber"
            sobre_name="Andrade Diniz de Araujo"
            reposi_name="Estudo"
            repsoi_text="A leitura e a escrita como práticas sociais envolvem processos discursivos e cognitivos. Por isso, toma-se a leitura como um momento uma ação de produção de sentidos em atividade de interlocução e compreensão responsiva. Assim como observa-se a escrita como um processo de interlocução e de interação social. Uma leitura significativa subsidia significativamente uma nova escrita, dado o movimento de escrita está arrolado na retextualização da leitura. Concebe-se, assim, a retextualização como um processo de produção textual significativa, no qual mobiliza funções linguísti"
            star_icon=true
            git_icon=true
            img_icon=true
            n_git="155"
            n_star="299"

        },
        git {
            user_name ="Pipoca"
            sobre_name="Andrade Diniz de Araujo"
            reposi_name="Comida"
            repsoi_text="ritings. In this way, this work supports new writing so helpful to let the pupils develop the retextualization process , used as a practice of reading and writing which mobilize linguistic cognitive function and textual linguistic and disc"
            star_icon=true
            git_icon=true
            img_icon=true
            n_git="355"
            n_star="49"

        },
        git {
            user_name ="Carlos"
            sobre_name="Gente Fina"
            reposi_name="Loucura"
            repsoi_text=" Licença Padrão ENAP::É permitida a reprodução e a exibição para uso educacional ou informativo, desde que respeitado o crédito ao autor original e citada a fonte (http://www.enap.gov.br). Permitida a inclusão da obra em Repositórios ou Portais de Acesso Aberto, desde que fique claro para os usuários esses “termos de uso”"
            star_icon=true
            git_icon=true
            img_icon=true
            n_git="200"
            n_star="200"

        },
        git {
            user_name ="Bruno"
            sobre_name="Araujo"
            reposi_name="Pratos de Comida"
            repsoi_text=" Licença Padrão ENAP::É permitida a reprodução e a exibição para uso educacional ou informativo, desde que respeitado o crédito ao autor original e citada a fonte (http://www.enap.gov.br). Permitida a inclusão da obra em Repositórios ou Portais de Acesso Aberto, desde que fique claro para os usuários esses “termos de uso”"
            star_icon=true
            git_icon=true
            img_icon=true
            n_git="350"
            n_star="599"

        },
        git {
            user_name ="Jerson"
            sobre_name="Diniz"
            reposi_name="Eletricidade"
            repsoi_text=" Licença Padrão ENAP::É permitida a reprodução e a exibição para uso educacional ou informativo, desde que respeitado o crédito ao autor original e citada a fonte (http://www.enap.gov.br). Permitida a inclusão da obra em Repositórios ou Portais de Acesso Aberto, desde que fique claro para os usuários esses “termos de uso”"
            star_icon=true
            git_icon=true
            img_icon=true
            n_git="60"
            n_star="37"

        },
        git {
            user_name ="Kaio"
            sobre_name="Araujo"
            reposi_name="Desafio do carlos"
            repsoi_text=" Licença Padrão ENAP::É permitida a reprodução e a exibição para uso educacional ou informativo, desde que respeitado o crédito ao autor original e citada a fonte (http://www.enap.gov.br). Permitida a inclusão da obra em Repositórios ou Portais de Acesso Aberto, desde que fique claro para os usuários esses “termos de uso”"
            star_icon=true
            git_icon=true
            img_icon=true
            n_git="55"
            n_star="99"

        }



)
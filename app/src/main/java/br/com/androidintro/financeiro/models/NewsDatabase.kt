package br.com.androidintro.financeiro.models

import br.com.androidintro.financeiro.interfaces.NewsInterface

object NewsDatabase {
    private val newsList = listOf(
        // Notícias econômicas
        NewsInterface(
            1,
            "Economia",
            "Crise global afeta mercados emergentes",
            "Os mercados emergentes estão enfrentando desafios devido à desaceleração global, afetando o crescimento e os investimentos."
        ),
        NewsInterface(
            2,
            "Economia",
            "Inflação atinge maior patamar em 10 anos",
            "A inflação anual alcançou seu nível mais alto em uma década, pressionando os bancos centrais a aumentar as taxas de juros."
        ),
        NewsInterface(
            3,
            "Economia",
            "Tecnologia impulsiona setor financeiro",
            "A inovação tecnológica tem transformado o setor financeiro, com fintechs ganhando espaço e desafiando instituições tradicionais."
        ),
        NewsInterface(
            4,
            "Economia",
            "Acordo comercial traz alívio para exportadores",
            "O novo acordo comercial entre dois grandes blocos econômicos deve facilitar a exportação de bens e serviços, impulsionando a economia."
        ),
        NewsInterface(
            5,
            "Economia",
            "Mercado de trabalho mostra sinais de recuperação",
            "A taxa de desemprego começou a cair, refletindo uma recuperação gradual após a crise provocada pela pandemia."
        ),
        NewsInterface(
            6,
            "Economia",
            "Investimentos verdes ganham força",
            "O mercado de investimentos sustentáveis está em expansão, com mais investidores buscando projetos que alinhem retorno financeiro e impacto ambiental."
        ),

        // Notícias políticas
        NewsInterface(
            7,
            "Política",
            "Novo pacote de reformas é anunciado",
            "O governo anunciou um novo pacote de reformas para modernizar a legislação trabalhista e impulsionar a economia."
        ),
        NewsInterface(
            8,
            "Política",
            "Debate sobre sistema eleitoral aquece no Congresso",
            "A proposta de reforma do sistema eleitoral é tema central dos debates no Congresso, dividindo opiniões entre os parlamentares."
        ),
        NewsInterface(
            9,
            "Política",
            "Aprovação de lei anticorrupção gera polêmica",
            "A nova lei anticorrupção foi aprovada, gerando debates intensos sobre seu impacto na política e no setor público."
        ),
        NewsInterface(
            10,
            "Política",
            "Aliança política busca fortalecimento regional",
            "Líderes de vários partidos se uniram para formar uma nova aliança política com o objetivo de fortalecer o desenvolvimento regional."
        ),
        NewsInterface(
            11,
            "Política",
            "Política externa foca em novos acordos bilaterais",
            "O governo está focado em firmar novos acordos bilaterais para fortalecer as relações comerciais e diplomáticas com outros países."
        ),
        NewsInterface(
            12,
            "Política",
            "Projeto de lei de proteção ambiental avança no Senado",
            "O projeto de lei que visa aumentar a proteção ambiental foi aprovado em uma comissão do Senado, avançando para a votação final."
        ),        NewsInterface(
            13,
            "Esporte",
            "Mercado de trabalho mostra sinais de recuperação",
            "A taxa de desemprego começou a cair, refletindo uma recuperação gradual após a crise provocada pela pandemia."
        ),
        NewsInterface(
            14,
            "Esporte",
            "Aliança política busca fortalecimento regional",
            "Líderes de vários partidos se uniram para formar uma nova aliança política com o objetivo de fortalecer o desenvolvimento regional."
        ),
        NewsInterface(
            15,
            "Esporte",
            "Crise global afeta mercados emergentes",
            "Os mercados emergentes estão enfrentando desafios devido à desaceleração global, afetando o crescimento e os investimentos."
        ),
        NewsInterface(
            16,
            "Esporte",
            "Tecnologia impulsiona setor financeiro",
            "A inovação tecnológica tem transformado o setor financeiro, com fintechs ganhando espaço e desafiando instituições tradicionais."
        ),
    )

    fun findAll() = newsList

    fun findById(id:Int) = newsList.find { it.id == id }

    fun findByCategory(category: String) = newsList.find { it.category == category }

}

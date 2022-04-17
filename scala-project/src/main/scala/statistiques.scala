object statistiques :

  def afficheTab(tab: Array[Int]) : Unit =
    println(tab.mkString(" | "))

  def indice(tab: Array[Int], v: Int) : Int =
    var estPresent = false
    var indice = -1
    for i <- 0 until tab.length
        if tab(i) == v && estPresent == false
    do
      estPresent = true
      indice = i
    indice

  def effectifTotal(tEffectifs: Array[Int]) : Int =
    var total = 0
    for element <- tEffectifs do
      total = total + element
    total

  def effectif(tValeurs: Array[Int], tEffectifs: Array[Int], v: Int) : Int =
    var effectif = -1
    for i <- 0 until tValeurs.length
      if tValeurs(i) == v
    do
      effectif = tEffectifs(i)
    return effectif

  def effectifCumuleCroissant(tValeurs: Array[Int], tEffectifs: Array[Int], v: Int) : Int =
    var ind = indice(tValeurs, v)
    if ind == -1 then
      return -1
    var effectif = 0
    for i <- 0 until ind do
      effectif += tEffectifs(i)
    effectif

  def moyenne(tValeurs: Array[Int], tEffectifs: Array[Int]) : Int =
    val effectifT = effectifTotal(tEffectifs)
    var total = 0
    for i <- 0 until tValeurs.length do
      total += tValeurs(i)*tEffectifs(i)
    return total/effectifT

  def nIemeValeur(tValeurs: Array[Int], tEffectifs: Array[Int], v: Int) : Int =
    var total = 0
    var valeur = 0
    for i <- 0 until tEffectifs.length
        j <- 0 until tEffectifs(i)
      do
        total += 1
        if total == v then
              valeur = tValeurs(i)
    return valeur

  def mediane(tValeurs: Array[Int], tEffectifs: Array[Int]) : Float =
    val effectif = effectifTotal(tEffectifs)
    var mediane = 0
    if effectif % 2 == 0 then
      mediane = (nIemeValeur(tValeurs, tEffectifs, effectif/2) + nIemeValeur(tValeurs, tEffectifs, effectif/2 + 1))/2
    else
      mediane = nIemeValeur(tValeurs, tEffectifs, (effectif / 2) + 1)
    return mediane

  def premierQuartile(tValeurs: Array[Int], tEffectifs: Array[Int]) : Int =
    return nIemeValeur(tValeurs, tEffectifs, (0.25 * effectifTotal(tEffectifs)).toInt)

  def main(args:Array[String]) : Unit =
    val temps = Array(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5)
    val effectifs = Array(3, 2, 2, 3, 2, 3, 4, 5, 2, 3, 1)

    println(" Q2 ---- Affichage temps ----")
    afficheTab(temps)

    println(" Q2 ---- Affichage effectifs ----")
    afficheTab(effectifs)

    println(" Q3 ---- Affichage indice ----")
    assert(indice(effectifs, 2) == 1)
    assert(indice(effectifs, 10) == -1)
    println("Test indice OK")

    println(" Q4 ---- Affichage effectif total ----")
    println(effectifTotal(effectifs))

    println(" Q5 ---- Affichage effectif d'une valeur ----")
    assert(effectif(temps, effectifs, -2) == 3)
    assert(effectif(temps, effectifs, -10) == -1)
    println("Test effectif OK")

    println(" Q6 ---- Effectif cumule croissant ----")
    assert(effectifCumuleCroissant(temps, effectifs, 0) == 12)
    assert(effectifCumuleCroissant(temps, effectifs, -10) == -1)
    println("Test effectif cumule croissant OK")

    println(" Q7 ---- Moyenne ----")
    assert(moyenne(temps, effectifs) == 0)
    println("Test Moyenne OK")

    println("Q8 ---- nIemeValeur ----")
    println(nIemeValeur(temps, effectifs, 15))

    println("Q9 ---- mediane ----")
    println(mediane(temps, effectifs))

    println("Q10 ---- premierQuartile ----")
    println(premierQuartile(temps, effectifs))

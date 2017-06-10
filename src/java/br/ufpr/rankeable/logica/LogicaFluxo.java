/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.rankeable.logica;

import br.ufpr.rankeable.modelo.Rankeavel;
import java.util.List;


/**
 *
 * @author helio
 */
public class LogicaFluxo implements Navegacao {

    private PegaRankeaveis pegadorDeRankeavel;
    private List<Rankeavel> historico;
    
    @Override
    public Rankeavel getProximo() {
        //...
        pegadorDeRankeavel.getRankeaveis();
    }

    @Override
    public Rankeavel getAnterior() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

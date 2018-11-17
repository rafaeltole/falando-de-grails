package concot

class Cotacao {

	BigDecimal valor
	Date data

	static belongsTo = [item: Item, moeda: Moeda, fornecedor: Fornecedor ]
	
    static constraints = {
    	valor nullable:false, blank:false
    	data nullable:false, blank:false
    	item nullable:false
    	moeda nullable:false
    	fornecedor nullable:false
    }
}

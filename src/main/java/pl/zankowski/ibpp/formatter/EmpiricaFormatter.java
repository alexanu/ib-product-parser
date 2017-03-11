package pl.zankowski.ibpp.formatter;

/**
 * @author Wojciech Zankowski
 */
public class EmpiricaFormatter implements OutputFormatter {

    @Override
    public String parse(String symbol, String description, String currency, String exchange, String secType, String ISIN) {
        StringBuilder builder = new StringBuilder();
        builder.append("<MarketSymbolDefinition UTPInstrumentClass=\"01\" category=\"STK\" exchangeID=\"");
        builder.append(exchange.toUpperCase());
        builder.append("\" expired=\"false\" expiryDate=\"19700101\" instrumentCode=\"");
        builder.append(ISIN.toUpperCase());
        builder.append("\" mic=\"-\" multiplier=\"1.00000\" optionType=\"None\" precisionPrice=\"2\" precisionVolume=\"0\" proprietarySymbolIndex=\"\" proprietaryTradingCode=\"\" shortSymbol=\"");
        builder.append(symbol.toUpperCase());
        builder.append("\" strikePrice=\"\" symbol=\"");
        builder.append(symbol.toUpperCase());
        builder.append("\" tradingCurrency=\"USD\" underlyingISINCode=\"\"/>");
        return builder.toString();
    }

}

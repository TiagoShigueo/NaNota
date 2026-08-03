package br.com.nanota.backend.service;

import java.util.ArrayList;
import java.util.List;

import br.com.nanota.backend.model.Instrument;

public class InstrumentService {
    private List<Instrument> instruments = new ArrayList<>();

    public Instrument createInstrument(Long idInstrument, String name) {
        Instrument instrument = new Instrument(idInstrument, name);
        instruments.add(instrument);
        return instrument;
    }

    public List<Instrument> getInstrument() {
        return instruments;
    }
}

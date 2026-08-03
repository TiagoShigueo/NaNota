package br.com.nanota.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.nanota.backend.model.Instrument;
import br.com.nanota.backend.service.InstrumentService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/instrument")
public class InstrumentController {
    private final InstrumentService instrumentService = new InstrumentService();

    @PostMapping("/createInstrument")
    public Instrument createInstrument(@RequestParam String name) {
        return instrumentService.createInstrument(null, name);
    }

    @GetMapping("/getInstrument")
    public List<Instrument> getInstrument() {
        return instrumentService.getInstrument();
    }

}

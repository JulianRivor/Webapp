package org.imasd.webapp.domain.web;
import org.imasd.webapp.domain.Telefono;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/telefonoes")
@Controller
@RooWebScaffold(path = "telefonoes", formBackingObject = Telefono.class)
public class TelefonoController {
}

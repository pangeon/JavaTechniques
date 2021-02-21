package pl.cecherz.proglang;

import pl.cecherz.proglang.paradigm.OOP;
import pl.cecherz.proglang.paradigm.ParadigmStrategy;
import pl.cecherz.proglang.types.Type;
import pl.cecherz.proglang.types.TypesStrategy;
import pl.cecherz.proglang.usage.Applications;
import pl.cecherz.proglang.usage.UsageProgrammingLanguage;

public class ProgrammingLang implements TypesStrategy, ParadigmStrategy, UsageProgrammingLanguage {

    TypesStrategy typesStrategy;
    ParadigmStrategy paradigmStrategy;
    UsageProgrammingLanguage usage;

    @Override
    public void defineAllTypesInLang(Type[] types) {
        typesStrategy.defineAllTypesInLang(types);
    }

    @Override
    public void setMainParadigm(OOP mainParadigm) {
        paradigmStrategy.setMainParadigm(mainParadigm);
    }

    @Override
    public void setApplications(Applications applications) {
        usage.setApplications(applications);
    }
}

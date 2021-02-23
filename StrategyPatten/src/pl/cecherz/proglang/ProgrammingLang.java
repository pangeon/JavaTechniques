package pl.cecherz.proglang;

import pl.cecherz.proglang.paradigm.OOP;
import pl.cecherz.proglang.paradigm.ParadigmStrategy;
import pl.cecherz.proglang.types.Type;
import pl.cecherz.proglang.types.TypesStrategy;
import pl.cecherz.proglang.usage.Applications;
import pl.cecherz.proglang.usage.UsageProgrammingLanguage;

public class ProgrammingLang implements TypesStrategy, ParadigmStrategy, UsageProgrammingLanguage {

    public TypesStrategy typesStrategy;
    public ParadigmStrategy paradigmStrategy;
    UsageProgrammingLanguage usage;

    @Override
    public void defineAllPrimitiveTypesInLang(Type[] types) {
        typesStrategy.defineAllPrimitiveTypesInLang(types);
    }

    @Override
    public void setMainParadigm(OOP mainParadigm) {
        paradigmStrategy.setMainParadigm(mainParadigm);
    }

    @Override
    public void setInternetApplications(Applications applications) {
        usage.setInternetApplications(applications);
    }
}

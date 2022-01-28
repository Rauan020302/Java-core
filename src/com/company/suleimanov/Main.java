package com.company.suleimanov;

import com.company.suleimanov.model.Specialist;
import com.company.suleimanov.model.Specialty;
import com.company.suleimanov.util.StreamApiUtil;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //List<Specialist> specialists = OldApproachUtil.getSpecialists();
        List<Specialist> specialists = StreamApiUtil.getSpecialists();

        // Filter
//        List<Specialist> engineers = OldApproachUtil.filterBySpecialty(specialists, Specialty.ENGINEER);
        List<Specialist> engineers = StreamApiUtil.filterBySpecialty(specialists, Specialty.ENGINEER);
        StreamApiUtil.printSpecialists(engineers);

        // Sorting
        List<Specialist> sortedSpecialistsAsc = StreamApiUtil.sortSpecialistsByNameAsc(specialists);
        List<Specialist> sortedSpecialistsDesc = StreamApiUtil.sortSpecialistsByNameDesc(specialists);
        StreamApiUtil.printSpecialists(sortedSpecialistsAsc);
        StreamApiUtil.printSpecialists(sortedSpecialistsDesc);

        // Max salary
        Specialist withMaxSalary = StreamApiUtil.findWithMaxSalary(specialists);
        System.out.println(withMaxSalary);
        // Min salary
        Specialist withMinSalary = StreamApiUtil.findWithMinSalary(specialists);
        System.out.println(withMinSalary);

        // Grouping
        Map<Specialty, List<Specialist>> groupedBySpecialty = StreamApiUtil.groupBySpecialty(specialists);
        System.out.println(groupedBySpecialty);

        // All engineers
//        boolean allEngineers = OldApproachUtil.matchAllEngineers(specialists);
        boolean allEngineers = StreamApiUtil.matchAllEngineers(specialists);
        System.out.println(allEngineers);

        // Any engineers
//        boolean anyEngineer = OldApproachUtil.matchAnyEnginner(specialists);
        boolean anyEngineer = StreamApiUtil.matchAnyEngineer(specialists);
        System.out.println(anyEngineer);

        // All salary more then
        //boolean allSalaryMoreThen1000 = OldApproachUtil.matchAllSalaryMoreThen(specialists, new BigDecimal(10000));
        boolean allSalaryMoreThen1000 = StreamApiUtil.matchAllSalaryMoreThen(specialists, new BigDecimal(10000));
        System.out.println(allSalaryMoreThen1000);

        // No one with salary more then
//        boolean noOneWithSalaryMoreThen10000 = OldApproachUtil.matchNoneSalaryMoreThen(specialists, new BigDecimal(10000));
        boolean noOneWithSalaryMoreThen10000 = StreamApiUtil.matchNoneSalaryMoreThen(specialists, new BigDecimal(10000));
        System.out.println(noOneWithSalaryMoreThen10000);
    }
}

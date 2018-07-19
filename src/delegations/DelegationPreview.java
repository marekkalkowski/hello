package delegations;


import console.ConsolePrinter;

public class DelegationPreview {

    private final DelegationReadFile delegationReadFile = new DelegationReadFile ();
    private final DelegationRepository delegationRepository = new DelegationRepository ();
    private final ConsolePrinter consolePrinter = new ConsolePrinter();

    public void delegationPreview(){

        // tu: odczyt danych z pliku konfiguracyjnego
        String fileDelegation = "delegation.txt";

        delegationReadFile.delegationReadFile (fileDelegation);

        StringBuilder out = new StringBuilder();

        out.trimToSize ();


        out.append (chrRepeat ("=",222) )
                .append("\n");


        // nagłówek pierwsza linia
        out.append ("|")
                .append (" Data").append (chrRepeat (" ", 5))
                .append (" | " )
                .append ("Inię").append (chrRepeat (" ",9))
                .append (" | ")
                .append ("Nazwisko").append (chrRepeat (" ", 8))
                .append (" | ")
                .append ("Delegacja").append (chrRepeat (" ", 13))
                .append (" | ")
                .append ("Kraj").append (chrRepeat (" ", 15))
                .append (" | ")
                .append ("Miasto").append (chrRepeat (" ", 10))
                .append (" | ")
                .append ("Firma").append (chrRepeat (" ", 14))
                .append (" | ")
                .append ("Adres").append (chrRepeat (" ", 24))
                .append (" | ")
                .append ("Cel delegacji").append (chrRepeat (" ", 8))
                .append (" | ")
                .append ("Status").append (chrRepeat (" ", 3))
                .append (" | ")
                .append ("z miasta").append (chrRepeat (" ", 4))
                .append (" | ")
                .append("\n");

        // nagłówek druga linia
        out.append ("| ")
                .append ("utworzenia")
                .append (" | ")
                .append (chrRepeat (" ", 13))
                .append (" | ")
                .append (chrRepeat (" ", 16))
                .append (" | ")
                .append ("    od    ")
                .append (" | ")
                .append ("    do    ")
                .append (" | ")
                .append (chrRepeat (" ", 19))
                .append (" | ")
                .append (chrRepeat (" ", 16))
                .append (" | ")
                .append (chrRepeat (" ", 19))
                .append (" | ")
                .append (chrRepeat (" ", 29))
                .append (" | ")
                .append (chrRepeat (" ", 21))
                .append (" | ")
                .append (chrRepeat (" ", 9))
                .append (" | ")
                .append (chrRepeat (" ",0) )
                .append (" | ")
                .append("\n");

        out.append (chrRepeat ("=",222) )
                .append("\n");

        for (Delegation p: delegationRepository.listDelegations) {

            out.append("| ")
                    .append(p.getCreationDate())
                    .append(" | ")
                    .append(p.getEmployee().getEmployeeName ())
                    .append(" | ")
                    .append(p.getEmployee().getEmployeeSurname ())
                    .append(" | ")
                    .append(p.getStartDate())
                    .append(" | ")
                    .append(p.getEndDate())
                    .append(" | ")
                    .append(p.getDestination().getDestinationCountry())
                    .append(" | ")
                    .append(p.getDestination().getDestinationCity())
                    .append(" | ")
                    .append(p.getDestination().getDestinationCompany())
                    .append(" | ")
                    .append(p.getDestination().getDestinationCompanyAddress())
                    .append(" | ")
                    .append(p.getPurpose())
                    .append(" | ")
                    .append(p.getStatus())
                    .append(" | ")
                    .append(p.getStartPoint())
                    .append(" | ")
                    .append("\n");

        }
        out.append (chrRepeat ("=",222) )
                .append("\n");

        consolePrinter.printLine(out.toString ());

    }

    private String chrRepeat(String str, int n){

        StringBuilder spaceRep = new StringBuilder ();

        for (int i = 0; i <= n; i++) {
            spaceRep.append (str);
        }

        return spaceRep.toString ();
    }
}
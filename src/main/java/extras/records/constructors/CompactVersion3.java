package extras.records.constructors;

/*╔═══════════════════════════════════════╗
  ║          COMPACT CONSTRUCTOR          ║
  ╠═══════════════════════════════════════╣
  ║- ONLY FOR RECORDS                     ║
  ║- MODIFY/VALIDATE INPUTS GIVEN FOR THE ║
  ║   DEFAULT-ALL-ARGS-CONSTRUCTOR        ║
  ╚═══════════════════════════════════════╝*/
public record CompactVersion3(String name, Integer price) {

  public CompactVersion3 {

   price += 500;
    name = "CompactVersion3: " + name;
  }

}
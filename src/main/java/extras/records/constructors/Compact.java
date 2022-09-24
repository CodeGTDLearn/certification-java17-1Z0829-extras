package extras.records.constructors;

/*╔═══════════════════════════════════════╗
  ║          COMPACT CONSTRUCTOR          ║
  ╠═══════════════════════════════════════╣
  ║- ONLY FOR RECORDS                     ║
  ║- MODIFY/VALIDATE INPUTS GIVEN FOR THE ║
  ║   DEFAULT-ALL-ARGS-CONSTRUCTOR        ║
  ╚═══════════════════════════════════════╝*/
public record Compact(String name, Integer price) {

  public Compact   {
     price += 500;
    name = "Changed by Compact-Constructor: " + name;
  }

}
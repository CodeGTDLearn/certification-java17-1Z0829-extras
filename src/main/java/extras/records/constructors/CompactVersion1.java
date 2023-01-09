package extras.records.constructors;

/*╔═══════════════════════════════════════╗
  ║          COMPACT CONSTRUCTOR          ║
  ╠═══════════════════════════════════════╣
  ║- ONLY FOR RECORDS                     ║
  ║- MODIFY/VALIDATE INPUTS GIVEN FOR THE ║
  ║   DEFAULT-ALL-ARGS-CONSTRUCTOR        ║
  ╚═══════════════════════════════════════╝*/
public record CompactVersion1(String name, Integer price) {

  public CompactVersion1 {
     price += 1;
   //  this.price += 500; // Compile-Error
    name = "CompactVersion1: " + name;
  }

}
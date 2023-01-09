package extras.records.constructors;

/*╔═══════════════════════════════════════╗
  ║          COMPACT CONSTRUCTOR          ║
  ╠═══════════════════════════════════════╣
  ║- ONLY FOR RECORDS                     ║
  ║- MODIFY/VALIDATE INPUTS GIVEN FOR THE ║
  ║   DEFAULT-ALL-ARGS-CONSTRUCTOR        ║
  ╚═══════════════════════════════════════╝*/
public record CompactVersion2(String name, Integer price) {

  public CompactVersion2 {

   //  this.price += 500; // Compile-Error
    name = "CompactVersion2: " + name;
  }

}
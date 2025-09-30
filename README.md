# Bookazon Sprint: Refactoring for the Future

In this sprint, we redesigned the Bookazon bookstore by identifying code smells and applying SOLID principles to improve maintainability and scalability. We refactored core classes, introduced a `CartItem` abstraction to support books, audiobooks, DVDs, and e-books, and enhanced order functionality with subscription discounts. Our team also practiced Agile Scrum and GitHub workflows, using a development branch between local feature branches and main to ensure stable, collaborative progress.

---

## Features

- Identified and documented design problems and code smells (e.g., tightly coupled classes, duplicated logic, long methods).  
- Refactored the codebase following SOLID principles to improve scalability and maintainability.  
- Introduced an abstract `CartItem` superclass, enabling support for Book, Audiobook, DVD, and Ebook.  
- Updated `Cart`, `User`, and `Bookazon` classes to work generically with `CartItem`.  
- Enhanced order printing to include subscription discounts.  
---

## Teamwork & Workflow

- Every design flaw and code smell was logged as a GitHub issue.  
- Feature branches were merged into the development branch before main to ensure stability.  
- All pull requests were peer-reviewed for quality and consistency.  
- Backlog was organized into milestones for sprint planning.  

---

## UML Diagrams

The project included UML diagrams illustrating the system before and after refactoring.  

- UML Before:

   <img width="1128" height="539" alt="Screenshot 2025-09-29 at 9 13 53 PM" src="https://github.com/user-attachments/assets/df0e5971-a610-4374-923a-b3abe6f10084" />

- UML After:

<img width="731" height="608" alt="Screenshot 2025-09-29 at 9 15 04 PM" src="https://github.com/user-attachments/assets/4f804764-f211-4e91-879d-4a35c9b715b2" />


---

## How to Run Bookazon

```bash
git clone https://github.com/your-team/Group-Sprint-1-Bookazon.git
cd Group-Sprint-1-Bookazon
javac src/*.java
java src/Bookazon

```
## Contributing
If you happen to find a bug and have any idea that we can extend on, feel free to submit a pull request and the collaborators would take a look at it. Thank you!

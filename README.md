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

<img width="1351" height="715" alt="Screenshot 2025-09-29 at 10 08 47 PM" src="https://github.com/user-attachments/assets/0663079b-00b9-4961-aebf-069dfaf3c4f1" />

- UML After:
<img width="908" height="774" alt="Screenshot 2025-09-29 at 10 12 09 PM" src="https://github.com/user-attachments/assets/af2caf6d-203b-4bff-8a40-c28efda6a433" />


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

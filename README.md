# Project Title

Welcome to Group 6 Simplified Medical Records repository! Please follow the guidelines below to contribute to this project.

---

##  How to Collaborate

### Step 1: Fork this Repository
1. Navigate to the [project repository](https://github.com/ifeanyicyriacus/medical-record-system.git) on GitHub.
2. Click on the `Fork` button at the top-right corner of the page.
3. This will create a copy of the repository under your GitHub account.



## Step 2: Clone the Forked Repository

Go to your forked repository on GitHub.
Click the Code button and copy the HTTPS or SSH link.
Open your terminal and run the following command to clone the repository:

```
git clone <repository-link>
```


## Step 3: Create a Branch

Navigate to the project directory:
```
cd medical-record-system
```

Create a new branch for your feature or bug fix:
```
git checkout -b feature/your-feature-name
```


## Step 4: Make Changes

Make your changes to the code or documentation.
Test your changes thoroughly.
Ensure your code follows the project's coding standards.


## Step 5: Commit and Push Changes

Stage your changes:
```
git add .
```
Commit your changes with a descriptive message:
```
git commit -m "Add feature: description of your changes"
```
Push your changes to your forked repository:

```
git push origin feature/your-feature-name

```

## Step 6: Create a Pull Request

Go to the original repository on GitHub.
Click on the Pull Requests tab.
Click the New Pull Request button.
Select your fork and branch.
Fill in the PR template with details about your changes.
Submit the pull request for review.


## Project Setup
Prerequisites

1. Python 3.8 or higher
2. MySQL 8.0 or higher
3. pip (Python package manager)

Installation

Create and activate a virtual environment:
```
python -m venv venv
source venv/bin/activate  # On Windows: venv\Scripts\activate

Install dependencies:
pip install -r requirements.txt

Set up environment variables:
cp .env.example .env
```
## Configure your .env file with your MySQL connection details.

```
DATABASE_URL=mysql://username:password@localhost:3306/medical_records
SECRET_KEY=your_very_secret_key
```
Database Setup

Create a new MySQL database in my SQL WorkBench:
```
CREATE DATABASE medical_records;
```


Run the database migration in your terminal:
```
flask db upgrade
```

Running the Application

Start the Flask development server:
```
flask run
```

Access the application at http://localhost:5000





## License
This project is licensed under the MIT License - see the LICENSE file for details.
